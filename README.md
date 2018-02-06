# MyriadRPCWrapper
Myriad RPC wrapper written in java. Use it to interact and receive live network updates from the myriadcoind server.

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

Your myriadcoin.conf file should like something like this.

```
listen=1 (if you want to accept incoming connections)
rpcuser=username
rpcpassword=password
server=1
rpcallowip=youriphere
txindex=1
daemon=1
rpcport=10889
zmqpubrawtx=tcp://youriphere:28332
zmqpubhashblock=tcp://youriphere:28332
zmqpubrawblock=tcp://youriphere:28332
zmqpubhashtx=tcp://youriphere:28332
      
```
