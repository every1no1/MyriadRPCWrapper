package Pojo.Transaction;

public class ScriptSig {

    private String asm;
    private String hex;

    public ScriptSig(String asm, String hex) {
        this.asm = asm;
        this.hex = hex;
    }

    public ScriptSig() {
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
}
