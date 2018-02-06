package RPCWrapper.Events;

import RPCWrapper.MyriadRPC;
import org.zeromq.ZMQ;
import org.zeromq.ZMsg;

public class NetworkListener implements Runnable {

    private Converter converter;
    private final OnUpdate onUpdate;
    private ZMQ.Socket socket;
    private MyriadRPC myriadRPC;

    public NetworkListener(MyriadRPC myriadRPC, String url, OnUpdate onUpdate) {
        this.myriadRPC = myriadRPC;
        this.onUpdate = onUpdate;
        this.converter = new Converter();
        ZMQ.Context context = ZMQ.context(1);
        socket = context.socket(ZMQ.SUB);
        socket.connect(url);
        run();
    }

    public void run(){
        subscribeRawTx();
        subscribeHashBlock();
        System.out.println("Subscribed.. Waiting for messages.");
        while (true) {
            ZMsg zMsg = ZMsg.recvMsg(socket);
            UpdateMessage updateMessage = converter.zmsgToUpdateMessage(zMsg);
            String updateType = updateMessage.getType();
            String message = updateMessage.getMessage();
            if (updateType.equals("hashblock")){
                onUpdate.hashBlockUpdate(myriadRPC.getBlock(message));
            } else if (updateType.equals("rawtx")){
                onUpdate.rawTxUpdate(myriadRPC.decodeRawTransaction(message));
            }
        }
    }

    private void subscribeRawTx(){
        socket.subscribe("rawtx".getBytes());
    }

    private void subscribeHashBlock(){
        socket.subscribe("hashblock".getBytes());
    }
}
