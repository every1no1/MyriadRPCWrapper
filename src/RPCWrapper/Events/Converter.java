package RPCWrapper.Events;

import org.zeromq.ZFrame;
import org.zeromq.ZMsg;

import java.util.Formatter;

public class Converter {

    public String binaryToHex(byte[] bytes)
    {
        Formatter f = new Formatter();
        try {
            for (byte c : bytes)
                f.format("%02X",c);

            return (f.toString().toLowerCase());
        } finally {
            f.close();
        }
    }

    public UpdateMessage zmsgToUpdateMessage(ZMsg zFrames){

        UpdateMessage updateMessage = null;
        String type = null;
        String message = null;
        int counter = 0;
        for (ZFrame zFrame:zFrames) {
            byte[] bytes = zFrame.getData();
            if (counter == 0){
                type = new String(bytes);
            } else if (counter == 1){
                message = binaryToHex(bytes);
            }
            counter++;
        }
        return new UpdateMessage(type, message);
    }
}