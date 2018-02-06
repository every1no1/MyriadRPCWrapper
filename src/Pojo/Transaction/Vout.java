package Pojo.Transaction;

import java.math.BigDecimal;

public class Vout {

    //for RPC
    private BigDecimal value;
    private int n;
    private ScriptPubKey scriptPubKey;

    //for DB
    private String spentTxId;
    private boolean spent;
    private long spentTs;

    public Vout() {
    }

    public Vout(BigDecimal value, int n, ScriptPubKey scriptPubKey, String spentTxId, boolean spent, long spentTs) {
        this.value = value;
        this.n = n;
        this.scriptPubKey = scriptPubKey;
        this.spentTxId = spentTxId;
        this.spent = spent;
        this.spentTs = spentTs;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public ScriptPubKey getScriptPubKey() {
        return scriptPubKey;
    }

    public void setScriptPubKey(ScriptPubKey scriptPubKey) {
        this.scriptPubKey = scriptPubKey;
    }

    public String getSpentTxId() {
        return spentTxId;
    }

    public void setSpentTxId(String spentTxId) {
        this.spentTxId = spentTxId;
    }

    public boolean isSpent() {
        return spent;
    }

    public void setSpent(boolean spent) {
        this.spent = spent;
    }

    public long getSpentTs() {
        return spentTs;
    }

    public void setSpentTs(long spentTs) {
        this.spentTs = spentTs;
    }
}
