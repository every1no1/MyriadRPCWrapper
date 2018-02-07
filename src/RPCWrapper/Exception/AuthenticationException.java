package RPCWrapper.Exception;

public class AuthenticationException extends RpcException {

    public AuthenticationException() {
        super("Invalid RPC Credentials");
    }

}

