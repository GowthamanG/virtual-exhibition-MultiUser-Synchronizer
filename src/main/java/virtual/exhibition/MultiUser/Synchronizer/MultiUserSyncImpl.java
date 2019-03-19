package virtual.exhibition.MultiUser.Synchronizer;

import io.grpc.stub.StreamObserver;

public class MultiUserSyncImpl extends multiUserSyncGrpc.multiUserSyncImplBase {

    @Override
    public StreamObserver<MultiUserSync.RequestPlayer> getPlayer(StreamObserver<MultiUserSync.Player> responseObserver) {
        return super.getPlayer(responseObserver);
    }

    @Override
    public StreamObserver<MultiUserSync.Player> setPlayer(StreamObserver<MultiUserSync.Response> responseObserver) {
        return super.setPlayer(responseObserver);
    }
}
