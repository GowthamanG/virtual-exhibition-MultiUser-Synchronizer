package virtual.exhibition.MultiUser.Synchronizer;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class VREPServer {

    private static final int port = 8080;

    public static void main(String[] args) throws IOException, InterruptedException{

        Server server = ServerBuilder.forPort(port).addService(new MultiUserSyncImpl()).build();

        server.start();
        System.out.println("Server started, listeing on port: " + port);

        if(!server.getListenSockets().isEmpty())
            System.out.println("Server is conntected to: " + server.getListenSockets().toString());
        server.awaitTermination();
    }
}

