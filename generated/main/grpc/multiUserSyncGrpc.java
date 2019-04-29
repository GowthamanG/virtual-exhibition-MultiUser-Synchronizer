import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: multiUser-sync.proto")
public final class multiUserSyncGrpc {

  private multiUserSyncGrpc() {}

  public static final String SERVICE_NAME = "multiUserSync";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<MultiUserSync.RequestUser,
      MultiUserSync.User> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUser",
      requestType = MultiUserSync.RequestUser.class,
      responseType = MultiUserSync.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MultiUserSync.RequestUser,
      MultiUserSync.User> getGetUserMethod() {
    io.grpc.MethodDescriptor<MultiUserSync.RequestUser, MultiUserSync.User> getGetUserMethod;
    if ((getGetUserMethod = multiUserSyncGrpc.getGetUserMethod) == null) {
      synchronized (multiUserSyncGrpc.class) {
        if ((getGetUserMethod = multiUserSyncGrpc.getGetUserMethod) == null) {
          multiUserSyncGrpc.getGetUserMethod = getGetUserMethod = 
              io.grpc.MethodDescriptor.<MultiUserSync.RequestUser, MultiUserSync.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "multiUserSync", "getUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MultiUserSync.RequestUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MultiUserSync.User.getDefaultInstance()))
                  .setSchemaDescriptor(new multiUserSyncMethodDescriptorSupplier("getUser"))
                  .build();
          }
        }
     }
     return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<MultiUserSync.User,
      MultiUserSync.Response> getSetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setUser",
      requestType = MultiUserSync.User.class,
      responseType = MultiUserSync.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MultiUserSync.User,
      MultiUserSync.Response> getSetUserMethod() {
    io.grpc.MethodDescriptor<MultiUserSync.User, MultiUserSync.Response> getSetUserMethod;
    if ((getSetUserMethod = multiUserSyncGrpc.getSetUserMethod) == null) {
      synchronized (multiUserSyncGrpc.class) {
        if ((getSetUserMethod = multiUserSyncGrpc.getSetUserMethod) == null) {
          multiUserSyncGrpc.getSetUserMethod = getSetUserMethod = 
              io.grpc.MethodDescriptor.<MultiUserSync.User, MultiUserSync.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "multiUserSync", "setUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MultiUserSync.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MultiUserSync.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new multiUserSyncMethodDescriptorSupplier("setUser"))
                  .build();
          }
        }
     }
     return getSetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<MultiUserSync.RequestTracker,
      MultiUserSync.Tracker> getGetTrackerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTracker",
      requestType = MultiUserSync.RequestTracker.class,
      responseType = MultiUserSync.Tracker.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MultiUserSync.RequestTracker,
      MultiUserSync.Tracker> getGetTrackerMethod() {
    io.grpc.MethodDescriptor<MultiUserSync.RequestTracker, MultiUserSync.Tracker> getGetTrackerMethod;
    if ((getGetTrackerMethod = multiUserSyncGrpc.getGetTrackerMethod) == null) {
      synchronized (multiUserSyncGrpc.class) {
        if ((getGetTrackerMethod = multiUserSyncGrpc.getGetTrackerMethod) == null) {
          multiUserSyncGrpc.getGetTrackerMethod = getGetTrackerMethod = 
              io.grpc.MethodDescriptor.<MultiUserSync.RequestTracker, MultiUserSync.Tracker>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "multiUserSync", "getTracker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MultiUserSync.RequestTracker.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MultiUserSync.Tracker.getDefaultInstance()))
                  .setSchemaDescriptor(new multiUserSyncMethodDescriptorSupplier("getTracker"))
                  .build();
          }
        }
     }
     return getGetTrackerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<MultiUserSync.Tracker,
      MultiUserSync.Response> getSetTrackerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setTracker",
      requestType = MultiUserSync.Tracker.class,
      responseType = MultiUserSync.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MultiUserSync.Tracker,
      MultiUserSync.Response> getSetTrackerMethod() {
    io.grpc.MethodDescriptor<MultiUserSync.Tracker, MultiUserSync.Response> getSetTrackerMethod;
    if ((getSetTrackerMethod = multiUserSyncGrpc.getSetTrackerMethod) == null) {
      synchronized (multiUserSyncGrpc.class) {
        if ((getSetTrackerMethod = multiUserSyncGrpc.getSetTrackerMethod) == null) {
          multiUserSyncGrpc.getSetTrackerMethod = getSetTrackerMethod = 
              io.grpc.MethodDescriptor.<MultiUserSync.Tracker, MultiUserSync.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "multiUserSync", "setTracker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MultiUserSync.Tracker.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MultiUserSync.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new multiUserSyncMethodDescriptorSupplier("setTracker"))
                  .build();
          }
        }
     }
     return getSetTrackerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static multiUserSyncStub newStub(io.grpc.Channel channel) {
    return new multiUserSyncStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static multiUserSyncBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new multiUserSyncBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static multiUserSyncFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new multiUserSyncFutureStub(channel);
  }

  /**
   */
  public static abstract class multiUserSyncImplBase implements io.grpc.BindableService {

    /**
     */
    public void getUser(MultiUserSync.RequestUser request,
        io.grpc.stub.StreamObserver<MultiUserSync.User> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     */
    public void setUser(MultiUserSync.User request,
        io.grpc.stub.StreamObserver<MultiUserSync.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSetUserMethod(), responseObserver);
    }

    /**
     */
    public void getTracker(MultiUserSync.RequestTracker request,
        io.grpc.stub.StreamObserver<MultiUserSync.Tracker> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTrackerMethod(), responseObserver);
    }

    /**
     */
    public void setTracker(MultiUserSync.Tracker request,
        io.grpc.stub.StreamObserver<MultiUserSync.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSetTrackerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                MultiUserSync.RequestUser,
                MultiUserSync.User>(
                  this, METHODID_GET_USER)))
          .addMethod(
            getSetUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                MultiUserSync.User,
                MultiUserSync.Response>(
                  this, METHODID_SET_USER)))
          .addMethod(
            getGetTrackerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                MultiUserSync.RequestTracker,
                MultiUserSync.Tracker>(
                  this, METHODID_GET_TRACKER)))
          .addMethod(
            getSetTrackerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                MultiUserSync.Tracker,
                MultiUserSync.Response>(
                  this, METHODID_SET_TRACKER)))
          .build();
    }
  }

  /**
   */
  public static final class multiUserSyncStub extends io.grpc.stub.AbstractStub<multiUserSyncStub> {
    private multiUserSyncStub(io.grpc.Channel channel) {
      super(channel);
    }

    private multiUserSyncStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected multiUserSyncStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new multiUserSyncStub(channel, callOptions);
    }

    /**
     */
    public void getUser(MultiUserSync.RequestUser request,
        io.grpc.stub.StreamObserver<MultiUserSync.User> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setUser(MultiUserSync.User request,
        io.grpc.stub.StreamObserver<MultiUserSync.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTracker(MultiUserSync.RequestTracker request,
        io.grpc.stub.StreamObserver<MultiUserSync.Tracker> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTrackerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setTracker(MultiUserSync.Tracker request,
        io.grpc.stub.StreamObserver<MultiUserSync.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetTrackerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class multiUserSyncBlockingStub extends io.grpc.stub.AbstractStub<multiUserSyncBlockingStub> {
    private multiUserSyncBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private multiUserSyncBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected multiUserSyncBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new multiUserSyncBlockingStub(channel, callOptions);
    }

    /**
     */
    public MultiUserSync.User getUser(MultiUserSync.RequestUser request) {
      return blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public MultiUserSync.Response setUser(MultiUserSync.User request) {
      return blockingUnaryCall(
          getChannel(), getSetUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public MultiUserSync.Tracker getTracker(MultiUserSync.RequestTracker request) {
      return blockingUnaryCall(
          getChannel(), getGetTrackerMethod(), getCallOptions(), request);
    }

    /**
     */
    public MultiUserSync.Response setTracker(MultiUserSync.Tracker request) {
      return blockingUnaryCall(
          getChannel(), getSetTrackerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class multiUserSyncFutureStub extends io.grpc.stub.AbstractStub<multiUserSyncFutureStub> {
    private multiUserSyncFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private multiUserSyncFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected multiUserSyncFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new multiUserSyncFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<MultiUserSync.User> getUser(
        MultiUserSync.RequestUser request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<MultiUserSync.Response> setUser(
        MultiUserSync.User request) {
      return futureUnaryCall(
          getChannel().newCall(getSetUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<MultiUserSync.Tracker> getTracker(
        MultiUserSync.RequestTracker request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTrackerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<MultiUserSync.Response> setTracker(
        MultiUserSync.Tracker request) {
      return futureUnaryCall(
          getChannel().newCall(getSetTrackerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER = 0;
  private static final int METHODID_SET_USER = 1;
  private static final int METHODID_GET_TRACKER = 2;
  private static final int METHODID_SET_TRACKER = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final multiUserSyncImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(multiUserSyncImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER:
          serviceImpl.getUser((MultiUserSync.RequestUser) request,
              (io.grpc.stub.StreamObserver<MultiUserSync.User>) responseObserver);
          break;
        case METHODID_SET_USER:
          serviceImpl.setUser((MultiUserSync.User) request,
              (io.grpc.stub.StreamObserver<MultiUserSync.Response>) responseObserver);
          break;
        case METHODID_GET_TRACKER:
          serviceImpl.getTracker((MultiUserSync.RequestTracker) request,
              (io.grpc.stub.StreamObserver<MultiUserSync.Tracker>) responseObserver);
          break;
        case METHODID_SET_TRACKER:
          serviceImpl.setTracker((MultiUserSync.Tracker) request,
              (io.grpc.stub.StreamObserver<MultiUserSync.Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class multiUserSyncBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    multiUserSyncBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return MultiUserSync.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("multiUserSync");
    }
  }

  private static final class multiUserSyncFileDescriptorSupplier
      extends multiUserSyncBaseDescriptorSupplier {
    multiUserSyncFileDescriptorSupplier() {}
  }

  private static final class multiUserSyncMethodDescriptorSupplier
      extends multiUserSyncBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    multiUserSyncMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (multiUserSyncGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new multiUserSyncFileDescriptorSupplier())
              .addMethod(getGetUserMethod())
              .addMethod(getSetUserMethod())
              .addMethod(getGetTrackerMethod())
              .addMethod(getSetTrackerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
