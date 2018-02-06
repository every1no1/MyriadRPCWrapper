package Pojo.Transaction;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.List;

public class WalletTransaction {

    public enum Category {
        @SerializedName("receive")
        RECEIVE,
        @SerializedName("send")
        SEND,
        @SerializedName("conflicted")
        CONFLICTED,
        @SerializedName("move")
        MOVE;
    }

    private BigDecimal fee;
    private BigDecimal amount;
    private long blockindex;
    private Category category;
    private long confirmations;
    private long time;
    private long timereceived;
    private long blocktime;
    private List<String> walletconflicts;
    private List<WalletTransaction> details;
    private String address;
    private String txid;
    private long block;
    private String hex;
    private String blockhash;
    private String account;
    private String otheraccount;
    private String comment;
    private String to;

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public long getBlockindex() {
        return blockindex;
    }

    public void setBlockindex(long blockindex) {
        this.blockindex = blockindex;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public long getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(long confirmations) {
        this.confirmations = confirmations;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getTimereceived() {
        return timereceived;
    }

    public void setTimereceived(long timereceived) {
        this.timereceived = timereceived;
    }

    public long getBlocktime() {
        return blocktime;
    }

    public void setBlocktime(long blocktime) {
        this.blocktime = blocktime;
    }

    public List<String> getWalletconflicts() {
        return walletconflicts;
    }

    public void setWalletconflicts(List<String> walletconflicts) {
        this.walletconflicts = walletconflicts;
    }

    public List<WalletTransaction> getDetails() {
        return details;
    }

    public void setDetails(List<WalletTransaction> details) {
        this.details = details;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public long getBlock() {
        return block;
    }

    public void setBlock(long block) {
        this.block = block;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public String getBlockhash() {
        return blockhash;
    }

    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getOtheraccount() {
        return otheraccount;
    }

    public void setOtheraccount(String otheraccount) {
        this.otheraccount = otheraccount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
