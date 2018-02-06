package RPCWrapper.Events;

import Pojo.Block.Block;
import Pojo.Transaction.Transaction;

public interface OnUpdate {
    void hashBlockUpdate(Block block);
    void rawTxUpdate(Transaction transaction);
}
