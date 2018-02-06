package Pojo.Block;

import java.util.List;
public class AuxPow {

    private AuxPowTx tx;
    private int index;
    private int chainindex;
    private List merklebranch;
    private List chainmerklebranch;
    private String parentblock;

    public AuxPow(AuxPowTx tx, int index, int chainindex, List merklebranch, List chainmerklebranch, String parentblock) {
        this.tx = tx;
        this.index = index;
        this.chainindex = chainindex;
        this.merklebranch = merklebranch;
        this.chainmerklebranch = chainmerklebranch;
        this.parentblock = parentblock;
    }

    public AuxPowTx getTx() {
        return tx;
    }

    public AuxPow() {
    }

    public void setTx(AuxPowTx tx) {
        this.tx = tx;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getChainindex() {
        return chainindex;
    }

    public void setChainindex(int chainindex) {
        this.chainindex = chainindex;
    }

    public List getMerklebranch() {
        return merklebranch;
    }

    public void setMerklebranch(List merklebranch) {
        this.merklebranch = merklebranch;
    }

    public List getChainmerklebranch() {
        return chainmerklebranch;
    }

    public void setChainmerklebranch(List chainmerklebranch) {
        this.chainmerklebranch = chainmerklebranch;
    }

    public String getParentblock() {
        return parentblock;
    }

    public void setParentblock(String parentblock) {
        this.parentblock = parentblock;
    }
}
