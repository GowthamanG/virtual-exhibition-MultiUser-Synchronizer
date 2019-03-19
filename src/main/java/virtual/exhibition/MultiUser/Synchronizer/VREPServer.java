package virtual.exhibition.MultiUser.Synchronizer;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class VREPServer {

    public static void main(String[] args) throws IOException, InterruptedException{

        Server server = ServerBuilder.forPort(8080).addService(new MultiUserSyncImpl()).build();

        server.start();

        server.awaitTermination();
    }
}
