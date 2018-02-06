package Pojo.Transaction;

import java.util.List;

public class ScriptPubKey {

    private String asm;
    private String hex;
    private int reqSigs;
    private String type;
    private List addresses;

    public ScriptPubKey(String asm, String hex, int reqSigs, String type, List addresses) {
        this.asm = asm;
        this.hex = hex;
        this.reqSigs = reqSigs;
        this.type = type;
        this.addresses = addresses;
    }

    public ScriptPubKey() {
    }

    public String getAsm() {
        return asm;
    }

    public void setAsm(String asm) {
        this.asm = asm;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public int getReqSigs() {
        return reqSigs;
    }

    public void setReqSigs(int reqSigs) {
        this.reqSigs = reqSigs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List getAddresses() {
        return addresses;
    }

    public void setAddresses(List addresses) {
        this.addresses = addresses;
    }
}
