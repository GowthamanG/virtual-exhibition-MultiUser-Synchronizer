package virtual.exhibition.MultiUser.Synchronizer;

import io.grpc.stub.StreamObserver;
import org.json.simple.parser.ParseException;
import java.io.IOException;

public class MultiUserSyncImpl extends multiUserSyncGrpc.multiUserSyncImplBase {

    @Override
    public StreamObserver<MultiUserSync.RequestPlayer> getPlayer(StreamObserver<MultiUserSync.Player> responseObserver) {
        //return super.getPlayer(responseObserver);

        return new StreamObserver<MultiUserSync.RequestPlayer>() {


            @Override
            public void onNext(MultiUserSync.RequestPlayer value) {
                int playerID = value.newBuilderForType().getRequestPlayerID();
                MultiUserSync.Player player = null;
                MultiUserSync.PlayerPosition playerPosition = null;
                MultiUserSync.PlayerRotation playerRotation = null;
                MultiUserSync.PlayerScale playerScale = null;

                JsonReader jsonReader = new JsonReader("players/players.json", playerID);

                try {
                    playerPosition = MultiUserSync.PlayerPosition.newBuilder()
                            .setXPosition(jsonReader.getPlayerPosition()[0])
                            .setXPosition(jsonReader.getPlayerPosition()[1])
                            .setXPosition(jsonReader.getPlayerPosition()[2])
                            .build();

                    playerRotation = MultiUserSync.PlayerRotation.newBuilder()
                            .setXRotation(jsonReader.getPlayerRotation()[0])
                            .setYRotation(jsonReader.getPlayerRotation()[1])
                            .setZRotation(jsonReader.getPlayerRotation()[2])
                            .build();

                    playerScale = MultiUserSync.PlayerScale.newBuilder()
                            .setXScale(jsonReader.getPlayerScale()[0])
                            .setYScale(jsonReader.getPlayerScale()[1])
                            .setZScale(jsonReader.getPlayerScale()[2])
                            .build();

                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                player.newBuilderForType().setPlayerPosition(playerPosition).setPlayerRotation(playerRotation)
                        .setPlayerScale(playerScale).build();

                responseObserver.onNext(player);
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();

            }
        };
    }

    @Override
    public StreamObserver<MultiUserSync.Player> setPlayer(StreamObserver<MultiUserSync.Response> responseObserver) {
        return super.setPlayer(responseObserver);
    }
}
