package virtual.exhibition.MultiUser.Synchronizer;

import io.grpc.stub.StreamObserver;
import java.util.HashMap;

public class MultiUserSyncImpl extends multiUserSyncGrpc.multiUserSyncImplBase {

    private HashMap<Integer, MultiUserSync.Player> players = new HashMap<>();

    @Override
    public StreamObserver<MultiUserSync.RequestPlayer> getPlayer(StreamObserver<MultiUserSync.Player> responseObserver) {

        return new StreamObserver<MultiUserSync.RequestPlayer>() {
            @Override
            public void onNext(MultiUserSync.RequestPlayer value) {

                MultiUserSync.Player player = players.get(value);

                responseObserver.onNext(player);

            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };

    }

    @Override
    public StreamObserver<MultiUserSync.Player> setPlayer(StreamObserver<MultiUserSync.Response> responseObserver) {

        return new StreamObserver<MultiUserSync.Player>() {
            @Override
            public void onNext(MultiUserSync.Player value) {
                players.put(value.getId(), value);

                MultiUserSync.Response response = MultiUserSync.Response.newBuilder().
                        setResponse(players.get(value.getId()).toString())
                        .build();

                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

}
