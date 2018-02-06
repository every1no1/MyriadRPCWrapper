# MyriadRPCWrapper
Myriad RPC wrapper written in java.

DEPENDENCIES
- Google gson. (For Json handling)
- Apache http client & core (For making remote procedure calls)
- JeroMQ (For listening to network updates such as new transactions and blocks)

If you're using maven you can just paste this into your pom.xml
```
<dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.8.2</version>
        </dependency>

        <dependency>
            <groupId>org.apache.httpcomponents</groupId>
            <artifactId>httpclient</artifactId>
            <version>4.5.5</version>
        </dependency>

        <dependency>
            <groupId>org.zeromq</groupId>
            <artifactId>jeromq</artifactId>
            <version>0.4.3</version>
        </dependency>
```

Example usage can be seen in the Main class. 
