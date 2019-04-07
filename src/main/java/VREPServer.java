import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class VREPServer {

    private static final int port = 8888;

    public static void main(String[] args) throws IOException, InterruptedException{

        Server server = ServerBuilder.forPort(port).addService(new MultiUserSyncImpl()).build();

        server.start();
        System.out.println("Server started, listening on port: " + port);

        server.awaitTermination();
    }
}

