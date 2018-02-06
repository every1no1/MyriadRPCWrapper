package RPCWrapper;

/**
 * Created by CIA on 29/08/2017.
 */
public enum APICalls {

    GET_NEW_ADDRESS("getnewaddress"),
    DUMP_PRIVATE_KEY("dumpprivkey"),
    GET_ACCOUNT("getaccount"),
    GET_ACCOUNT_ADDRESS("getaccountaddress"),
    LIST_ACCOUNTS("listaccounts"),
    LIST_ADDRESS_GROUPINGS("listaddressgroupings"),
    LIST_RECEIVED_BY_ACCOUNT("listreceivedbyaccount"),
    LIST_RECEIVED_BY_ADDRESS("listreceivedbyaddress"),
    SEND_FROM("sendfrom"),
    SEND_RAW_TRANSACTION("sendrawtransaction"),
    SET_ACCOUNT("setaccount"),
    SEND_TO_ADDRESS("sendtoaddress"),
    GET_ADDRESSES_BY_ACCOUNT("getaddressesbyaccount"),
    GET_RECEIVED_BY_ACCOUNT("getreceivedbyaccount"),
    GET_RECEIVED_BY_ADDRESS("getreceivedbyaddress"),
    GET_BALANCE("getbalance"),
    GET_TRANSACTION("gettransaction"),
    GET_CONNECTION_COUNT("getconnectioncount"),
    BACKUP_WALLET("backupwallet"),
    DECODE_RAW_TRANSACTION("decoderawtransaction"),
    GET_RAW_TRANSACTION("getrawtransaction"),
    LIST_TRANSACTIONS("listtransactions"),
    LIST_UNSPENT("listunspent"),
    CREATE_RAW_TRANSACTION("createrawtransaction"),
    SIGN_RAW_TRANSACTION("signrawtransaction"),
    VALIDATE_ADDRESS("validateaddress"),
    ENCRYPT_WALLET("encryptwallet"),
    GET_INFO("getinfo"),
    GET_MINING_INFO("getmininginfo"),
    GET_PEER_INFO("getpeerinfo"),
    GET_BLOCK("getblock"),
    GET_BLOCK_COUNT("getblockcount"),
    GET_BLOCK_HASH("getblockhash"),
    WALLETPASSPHRASE("walletpassphrase"),;

    private String value;

    private APICalls(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        //Using in BitcoinRPC#callAPIMethod(..)
        return value;
    }

}
