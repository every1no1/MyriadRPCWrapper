package RPCWrapper.Exception;

import com.google.gson.JsonObject;

public class RpcExceptionHandler {

    public void checkException(JsonObject response) throws RpcException {
        if (response.get("error") != null && response.get("error").isJsonObject() == true) {
            JsonObject errorJson = response.get("error").getAsJsonObject();
            String message = errorJson.get("message").getAsString();

            int code = errorJson.get("code").getAsInt();
            switch (code) {
                case -6:
                    throw new InsufficientFundsException(message);
                default:
                    throw new RpcException(message);
            }
        }
    }
}
