package Pojo.Block;

import Pojo.Transaction.Vin;
import Pojo.Transaction.Vout;

import java.util.ArrayList;

public class AuxPowTx {

    private String hex;
    private String txid;
    private String hash;
    private int size;
    private int vsize;
    private String version;
    private int locktime;
    private ArrayList<Vin> vin;
    private ArrayList<Vout> vout;
    private String blockhash;

    public AuxPowTx(String hex, String txid, String hash, int size, int vsize, String version, int locktime, ArrayList<Vin> vin, ArrayList<Vout> vout, String blockhash) {
        this.hex = hex;
        this.txid = txid;
        this.hash = hash;
        this.size = size;
        this.vsize = vsize;
        this.version = version;
        this.locktime = locktime;
        this.vin = vin;
        this.vout = vout;
        this.blockhash = blockhash;
    }

    public AuxPowTx() {
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getVsize() {
        return vsize;
    }

    public void setVsize(int vsize) {
        this.vsize = vsize;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getLocktime() {
        return locktime;
    }

    public void setLocktime(int locktime) {
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

    public String getBlockhash() {
        return blockhash;
    }

    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash;
    }
}
