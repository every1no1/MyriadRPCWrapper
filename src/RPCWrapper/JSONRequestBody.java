package RPCWrapper;

/**
 * Created by CIA on 29/08/2017.
 */
public class JSONRequestBody {

    private String method, id;
    private Object[] params = new Object[]{};

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }


}
