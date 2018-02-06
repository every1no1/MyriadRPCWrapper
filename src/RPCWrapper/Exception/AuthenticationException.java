package RPCWrapper.Exception;

/**
 * Created by CIA on 29/08/2017.
 */
public class AuthenticationException extends RpcException {

    public AuthenticationException() {
        super("Invalid RPC Credentials");
    }

}

