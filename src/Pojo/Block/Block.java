package Pojo.Block;
import Pojo.Transaction.Transaction;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Block {

    private String hash;
    private int confirmations;
    private int strippedsize;
    private int size;
    private int weight;
    private int height;
    private long version;
    private String versionHex;
    private String merkleRoot;
    private List<Transaction> txs;
    private List tx;
    private long time;
    private long mediantime;
    private long nonce;
    private String bits;
    private String pow_hash;
    private int pow_algo_id;
    private String pow_algo;
    private BigDecimal difficulty;
    private String chainwork;
    private AuxPow auxpow;
    private String previousblockhash;
    private String nextblockhash;

    public Block(String hash, int confirmations, int strippedsize, int size, int weight, int height, long version, String versionHex, String merkleRoot, List tx, long time, long mediantime, long nonce, String bits, String pow_hash, int pow_algo_id, String pow_algo, BigDecimal difficulty, String chainwork, AuxPow auxpow, String previousblockhash, String nextblockhash) {
        this.hash = hash;
        this.confirmations = confirmations;
        this.strippedsize = strippedsize;
        this.size = size;
        this.weight = weight;
        this.height = height;
        this.version = version;
        this.versionHex = versionHex;
        this.merkleRoot = merkleRoot;
        this.tx = tx;
        this.time = time;
        this.mediantime = mediantime;
        this.nonce = nonce;
        this.bits = bits;
        this.pow_hash = pow_hash;
        this.pow_algo_id = pow_algo_id;
        this.pow_algo = pow_algo;
        this.difficulty = difficulty;
        this.chainwork = chainwork;
        this.auxpow = auxpow;
        this.previousblockhash = previousblockhash;
        this.nextblockhash = nextblockhash;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public int getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    public int getStrippedsize() {
        return strippedsize;
    }

    public void setStrippedsize(int strippedsize) {
        this.strippedsize = strippedsize;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public String getVersionHex() {
        return versionHex;
    }

    public void setVersionHex(String versionHex) {
        this.versionHex = versionHex;
    }

    public String getMerkleRoot() {
        return merkleRoot;
    }

    public void setMerkleRoot(String merkleRoot) {
        this.merkleRoot = merkleRoot;
    }

    public List getTx() {
        return tx;
    }

    public void setTx(List tx) {
        this.tx = tx;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getMediantime() {
        return mediantime;
    }

    public void setMediantime(long mediantime) {
        this.mediantime = mediantime;
    }

    public long getNonce() {
        return nonce;
    }

    public void setNonce(long nonce) {
        this.nonce = nonce;
    }

    public String getBits() {
        return bits;
    }

    public void setBits(String bits) {
        this.bits = bits;
    }

    public String getPow_hash() {
        return pow_hash;
    }

    public void setPow_hash(String pow_hash) {
        this.pow_hash = pow_hash;
    }

    public int getPow_algo_id() {
        return pow_algo_id;
    }

    public void setPow_algo_id(int pow_algo_id) {
        this.pow_algo_id = pow_algo_id;
    }

    public String getPow_algo() {
        return pow_algo;
    }

    public void setPow_algo(String pow_algo) {
        this.pow_algo = pow_algo;
    }

    public BigDecimal getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(BigDecimal difficulty) {
        this.difficulty = difficulty;
    }

    public String getChainwork() {
        return chainwork;
    }

    public void setChainwork(String chainwork) {
        this.chainwork = chainwork;
    }

    public AuxPow getAuxpow() {
        return auxpow;
    }

    public void setAuxpow(AuxPow auxpow) {
        this.auxpow = auxpow;
    }

    public String getPreviousblockhash() {
        return previousblockhash;
    }

    public void setPreviousblockhash(String previousblockhash) {
        this.previousblockhash = previousblockhash;
    }

    public String getNextblockhash() {
        return nextblockhash;
    }

    public void setNextblockhash(String nextblockhash) {
        this.nextblockhash = nextblockhash;
    }

}

