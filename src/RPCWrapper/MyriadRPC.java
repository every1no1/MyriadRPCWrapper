package RPCWrapper;

import Pojo.Block.Block;
import Pojo.Transaction.Transaction;
import Pojo.Transaction.WalletTransaction;
import RPCWrapper.Exception.AuthenticationException;
import RPCWrapper.Exception.CallApiRpcException;
import RPCWrapper.Exception.RpcException;
import RPCWrapper.Exception.RpcExceptionHandler;
import com.google.gson.*;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class MyriadRPC {

    private String baseUrl;
    private RpcExceptionHandler rpcExceptionHandler = new RpcExceptionHandler();
    private Gson gson = new Gson();
    private HttpClient client = HttpClientBuilder.create().build();

    public MyriadRPC(String rpcUser, String rpcPassword, String rpcHost, String rpcPort) throws Exception {
        baseUrl = "http://" + rpcUser + ":" + rpcPassword + "@" + rpcHost + ":" + rpcPort + "/";
        try {
            HttpPost request = new HttpPost(baseUrl);
            int statusCode = client.execute(request).getStatusLine().getStatusCode();
            if (statusCode == 401) {  //401 is Http Unauthorized
                throw new AuthenticationException();
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    public boolean backupWallet(String destination) throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.BACKUP_WALLET, destination);
        if (jsonObj.get("error") == null) {
            return true;
        }
        return false;
    }

    public Transaction decodeRawTransaction(String hex) throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.DECODE_RAW_TRANSACTION, hex);
        rpcExceptionHandler.checkException(jsonObj);
        return gson.fromJson(jsonObj.get("result").getAsJsonObject(), Transaction.class);
    }

    public JsonObject getInfo() throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.GET_INFO);
        rpcExceptionHandler.checkException(jsonObj);
        return jsonObj.get("result").getAsJsonObject();
    }

    public JsonObject getMiningInfo() throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.GET_MINING_INFO);
        rpcExceptionHandler.checkException(jsonObj);
        return jsonObj.get("result").getAsJsonObject();
    }

    public Block getBlock(String blockhash) throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.GET_BLOCK, blockhash);
        rpcExceptionHandler.checkException(jsonObj);
        return gson.fromJson(jsonObj.get("result").getAsJsonObject(), Block.class);
    }

    public JsonObject getBlockAsJson(String blockhash) throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.GET_BLOCK, blockhash);
        rpcExceptionHandler.checkException(jsonObj);
        return jsonObj.get("result").getAsJsonObject();
    }

    public int getBlockCount() throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.GET_BLOCK_COUNT);
        rpcExceptionHandler.checkException(jsonObj);
        return jsonObj.get("result").getAsInt();
    }

    public String getBlockHash(int index) throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.GET_BLOCK_HASH, index);
        rpcExceptionHandler.checkException(jsonObj);
        return jsonObj.get("result").getAsString();
    }

    public String dumpPrivateKey(String address) throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.DUMP_PRIVATE_KEY, address);
        rpcExceptionHandler.checkException(jsonObj);
        return jsonObj.get("result").getAsString();
    }

    public String getRawTransaction(String txid) throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.GET_RAW_TRANSACTION, txid);
        rpcExceptionHandler.checkException(jsonObj);
        return jsonObj.get("result").getAsString();
    }

    public String getAccount(String address) throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.GET_ACCOUNT, address);
        rpcExceptionHandler.checkException(jsonObj);
        return jsonObj.get("result").getAsString();
    }

    public String getAccountAddress(String account) throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.GET_ACCOUNT_ADDRESS, account);
        rpcExceptionHandler.checkException(jsonObj);
        return jsonObj.get("result").getAsString();
    }

    public JsonArray getAddressesByAccount(String account) throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.GET_ADDRESSES_BY_ACCOUNT, account);
        rpcExceptionHandler.checkException(jsonObj);
        return jsonObj.get("result").getAsJsonArray();
    }

    public BigDecimal getBalance(String account) throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.GET_BALANCE, account);
        rpcExceptionHandler.checkException(jsonObj);
        return jsonObj.get("result").getAsBigDecimal();
    }

    public BigDecimal getBalance() throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.GET_BALANCE);
        rpcExceptionHandler.checkException(jsonObj);
        return jsonObj.get("result").getAsBigDecimal();
    }

    public BigDecimal getReceivedByAccount(String account) throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.GET_RECEIVED_BY_ACCOUNT, account);
        rpcExceptionHandler.checkException(jsonObj);
        return jsonObj.get("result").getAsBigDecimal();
    }

    public String getNewAddress() throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.GET_NEW_ADDRESS);
        rpcExceptionHandler.checkException(jsonObj);
        return jsonObj.get("result").getAsString();
    }

    public String getNewAddress(String account) throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.GET_NEW_ADDRESS, account);
        rpcExceptionHandler.checkException(jsonObj);
        return jsonObj.get("result").getAsString();
    }

    public BigDecimal getReceivedByAddress(String address) throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.GET_RECEIVED_BY_ADDRESS, address);
        rpcExceptionHandler.checkException(jsonObj);
        return jsonObj.get("result").getAsBigDecimal();
    }

    public JsonObject getTransaction(String txid) throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.GET_TRANSACTION, txid);
        rpcExceptionHandler.checkException(jsonObj);
//        return gson.fromJson(jsonObj.get("result").getAsJsonObject(), WalletTransaction.class);
        return jsonObj;
    }

    public JsonObject listAccounts() throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.LIST_ACCOUNTS);
        rpcExceptionHandler.checkException(jsonObj);
        return jsonObj.get("result").getAsJsonObject();
    }

    public JsonArray listReceivedByAccount() throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.LIST_RECEIVED_BY_ACCOUNT);
        rpcExceptionHandler.checkException(jsonObj);
        return jsonObj.get("result").getAsJsonArray();
    }

    public JsonArray listReceivedByAddress() throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.LIST_RECEIVED_BY_ADDRESS);
        rpcExceptionHandler.checkException(jsonObj);
        return jsonObj.get("result").getAsJsonArray();
    }

    public String sendFrom(String fromAccount, String toAddress, BigDecimal amount) throws RpcException {
        JsonObject response = callAPIMethod(APICalls.SEND_FROM, fromAccount, toAddress, amount);
        rpcExceptionHandler.checkException(response);
        return response.get("result").getAsString();
    }

    public String sendToAddress(String toAddress, BigDecimal amount) throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.SEND_TO_ADDRESS, toAddress, amount);
        rpcExceptionHandler.checkException(jsonObj);
        return jsonObj.get("result").getAsString();
    }

    public boolean validateAddress(String address) throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.VALIDATE_ADDRESS, address);
        rpcExceptionHandler.checkException(jsonObj);
        return jsonObj.get("result").getAsJsonObject().get("isvalid").getAsBoolean();
    }

    public JsonObject encryptWallet(String passphrase) throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.ENCRYPT_WALLET, passphrase);
        rpcExceptionHandler.checkException(jsonObj);
        return jsonObj.get("result").getAsJsonObject();
    }

    public void setAccount(String address, String account) throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.SET_ACCOUNT, address, account);
        rpcExceptionHandler.checkException(jsonObj);
    }

    public List<WalletTransaction> listTransactions(String account, int count, int from) throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.LIST_TRANSACTIONS, account, count, from);
        rpcExceptionHandler.checkException(jsonObj);

        return Arrays.asList(gson.fromJson(jsonObj.get("result").getAsJsonArray(), WalletTransaction[].class));
    }

    public JsonArray listUnspent(int minconf, int maxconf) throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.LIST_UNSPENT, minconf, maxconf);
        rpcExceptionHandler.checkException(jsonObj);

        return jsonObj.get("result").getAsJsonArray();
    }

    public JsonArray listUnspent(int minconf, String[] address) throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.LIST_UNSPENT, minconf, address);

        rpcExceptionHandler.checkException(jsonObj);
        return jsonObj.get("result").getAsJsonArray();
    }

    public JsonArray listUnspent(int minconf) throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.LIST_UNSPENT, minconf);
        rpcExceptionHandler.checkException(jsonObj);
        return jsonObj.get("result").getAsJsonArray();
    }

    public JsonArray listUnspent(int minconf, int maxconf, String[] address) throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.LIST_UNSPENT, minconf, maxconf, address);
        rpcExceptionHandler.checkException(jsonObj);

        return jsonObj.get("result").getAsJsonArray();
    }

    public JsonArray getPeerInfo() throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.GET_PEER_INFO);
        rpcExceptionHandler.checkException(jsonObj);

        return jsonObj.get("result").getAsJsonArray();
    }

    public WalletTransaction createRawTransaction(JsonObject[] prevOut, JsonObject out) throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.CREATE_RAW_TRANSACTION, prevOut, out);
        rpcExceptionHandler.checkException(jsonObj);

        return gson.fromJson(jsonObj.get("result").getAsJsonObject(), WalletTransaction.class);
    }

    public WalletTransaction signRawTransaction(String hexString) throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.SIGN_RAW_TRANSACTION,hexString);
        rpcExceptionHandler.checkException(jsonObj);

        return gson.fromJson(jsonObj.get("result").getAsJsonObject(), WalletTransaction.class);
    }

    public String sendRawTransaction(String hexString) throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.SEND_RAW_TRANSACTION,hexString);
        rpcExceptionHandler.checkException(jsonObj);

        return jsonObj.get("result").getAsString();
    }

    public void walletpassphrase(String passphrase, int timeout) throws RpcException {
        JsonObject jsonObj = callAPIMethod(APICalls.WALLETPASSPHRASE, passphrase, timeout);
        rpcExceptionHandler.checkException(jsonObj);

    }

    private JsonObject callAPIMethod(APICalls callMethod, Object... params) throws CallApiRpcException {
        JsonObject jsonObject = null;
        try {
            JSONRequestBody body = new JSONRequestBody();
            body.setMethod(callMethod.toString());
            if (params != null && params.length > 0) {
                body.setParams(params);
            }
            HttpPost post = new HttpPost(baseUrl);
            StringEntity postingString = new StringEntity(gson.toJson(body));
            post.setEntity(postingString);
            post.setHeader("Content-type", "application/json");
            HttpResponse response = client.execute(post);
            String responseString = EntityUtils.toString(response.getEntity());
            jsonObject = new JsonParser().parse(responseString).getAsJsonObject();
        } catch (Exception e) {
            throw new CallApiRpcException(e.getMessage());
        }
        return jsonObject;
    }

    public String jsonToPrettyString(JsonObject jsonObject) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String prettyJson = gson.toJson(jsonObject);
        gson = null;
        return prettyJson;


    }



}
