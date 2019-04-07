import io.grpc.stub.StreamObserver;


import java.util.HashMap;

public class MultiUserSyncImpl extends multiUserSyncGrpc.multiUserSyncImplBase {

    private HashMap<Integer, MultiUserSync.User> users = new HashMap<>();



    /*@Override
    public StreamObserver<MultiUserSync.RequestUser> getUser(StreamObserver<MultiUserSync.User> responseObserver) {

        return new StreamObserver<MultiUserSync.RequestUser>() {
            @Override
            public void onNext(MultiUserSync.RequestUser value) {

                MultiUserSync.User user = users.get(value);

                responseObserver.onNext(user);

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
    public StreamObserver<MultiUserSync.User> setUser(StreamObserver<MultiUserSync.Response> responseObserver) {

        return new StreamObserver<MultiUserSync.User>() {
            @Override
            public void onNext(MultiUserSync.User value) {
                users.put(value.getId(), value);

                MultiUserSync.Response response = MultiUserSync.Response.newBuilder().
                        setResponse(users.get(value.getId()).toString())
                        .build();

                System.out.println(response.toString());
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
    }*/

    @Override
    public void getUser(MultiUserSync.RequestUser request, StreamObserver<MultiUserSync.User> responseObserver) {

        MultiUserSync.User user = users.get(request.getRequestUserID());

        responseObserver.onNext(MultiUserSync.User.newBuilder(user).build());
    }

    @Override
    public void setUser(MultiUserSync.User request, StreamObserver<MultiUserSync.Response> responseObserver) {
        users.put(request.getId(), request);

        responseObserver.onNext(MultiUserSync.Response.newBuilder().
                setResponse("User us set: " + users.get(request.getId()).toString()).build());

        System.out.println(users);
    }
}
