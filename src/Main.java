import Pojo.Block.Block;
import Pojo.Transaction.Transaction;
import RPCWrapper.Events.NetworkListener;
import RPCWrapper.Events.OnUpdate;
import RPCWrapper.MyriadRPC;

public class Main {

    public static void main(String[] args) {

        String zeroMQUrl = "tcp://localhost:28332";
        MyriadRPC myriadRPC = null;
        try {
            myriadRPC = new MyriadRPC("username", "password", "localhost", "10889");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(myriadRPC.getInfo());
        NetworkListener networkListener = new NetworkListener(myriadRPC, zeroMQUrl, new OnUpdate() {

            public void hashBlockUpdate(Block block) {
                System.out.println("NEW BLOCK AT HEIGHT: " + block.getHeight());
            }

            public void rawTxUpdate(Transaction transaction) {
                System.out.println("NEW TX WITH ID: " + transaction.getTxid());
            }

        });
        networkListener.run();
    }
}
