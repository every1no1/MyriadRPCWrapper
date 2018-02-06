package Pojo.Transaction;

import java.math.BigDecimal;
import java.util.List;

public class Vin {


    private String coinbase;
    private String txid;
    private int vout;
    private ScriptSig scriptSig;
    private long sequence;
    private List txinwitness;

    public Vin(String coinbase, String txid, int vout, ScriptSig scriptSig, long sequence, List txinwitness) {
        this.coinbase = coinbase;
        this.txid = txid;
        this.vout = vout;
        this.scriptSig = scriptSig;
        this.sequence = sequence;
        this.txinwitness = txinwitness;
    }

    public String getCoinbase() {
        return coinbase;
    }

    public void setCoinbase(String coinbase) {
        this.coinbase = coinbase;
    }

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public int getVout() {
        return vout;
    }

    public void setVout(int vout) {
        this.vout = vout;
    }

    public ScriptSig getScriptSig() {
        return scriptSig;
    }

    public void setScriptSig(ScriptSig scriptSig) {
        this.scriptSig = scriptSig;
    }

    public long getSequence() {
        return sequence;
    }

    public void setSequence(long sequence) {
        this.sequence = sequence;
    }

    public List getTxinwitness() {
        return txinwitness;
    }

    public void setTxinwitness(List txinwitness) {
        this.txinwitness = txinwitness;
    }

}
