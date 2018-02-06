package Pojo.Transaction;

import java.util.ArrayList;

public class Transaction {

    private String txid;
    private String hash;
    private String size;
    private String vsize;
    private int version;
    private long locktime;
    private ArrayList<Vin> vin;
    private ArrayList<Vout> vout;

    public Transaction(String txid, String hash, String size, String vsize, int version, long locktime, ArrayList<Vin> vin, ArrayList<Vout> vout) {
        this.txid = txid;
        this.hash = hash;
        this.size = size;
        this.vsize = vsize;
        this.version = version;
        this.locktime = locktime;
        this.vin = vin;
        this.vout = vout;
    }

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getVsize() {
        return vsize;
    }

    public void setVsize(String vsize) {
        this.vsize = vsize;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public long getLocktime() {
        return locktime;
    }

    public void setLocktime(long locktime) {
        this.locktime = locktime;
    }

    public ArrayList<Vin> getVin() {
        return vin;
    }

    public void setVin(ArrayList<Vin> vin) {
        this.vin = vin;
    }

    public ArrayList<Vout> getVout() {
        return vout;
    }

    public void setVout(ArrayList<Vout> vout) {
        this.vout = vout;
    }

}
