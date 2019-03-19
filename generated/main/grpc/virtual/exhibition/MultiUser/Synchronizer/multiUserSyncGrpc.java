package virtual.exhibition.MultiUser.Synchronizer;

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

  public static final String SERVICE_NAME = "virtual.exhibition.MultiUser.Synchronizer.multiUserSync";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.RequestPlayer,
      virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Player> getGetPlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPlayer",
      requestType = virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.RequestPlayer.class,
      responseType = virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Player.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.RequestPlayer,
      virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Player> getGetPlayerMethod() {
    io.grpc.MethodDescriptor<virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.RequestPlayer, virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Player> getGetPlayerMethod;
    if ((getGetPlayerMethod = multiUserSyncGrpc.getGetPlayerMethod) == null) {
      synchronized (multiUserSyncGrpc.class) {
        if ((getGetPlayerMethod = multiUserSyncGrpc.getGetPlayerMethod) == null) {
          multiUserSyncGrpc.getGetPlayerMethod = getGetPlayerMethod = 
              io.grpc.MethodDescriptor.<virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.RequestPlayer, virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Player>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "virtual.exhibition.MultiUser.Synchronizer.multiUserSync", "getPlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.RequestPlayer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Player.getDefaultInstance()))
                  .setSchemaDescriptor(new multiUserSyncMethodDescriptorSupplier("getPlayer"))
                  .build();
          }
        }
     }
     return getGetPlayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Player,
      virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Response> getSetPlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setPlayer",
      requestType = virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Player.class,
      responseType = virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Player,
      virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Response> getSetPlayerMethod() {
    io.grpc.MethodDescriptor<virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Player, virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Response> getSetPlayerMethod;
    if ((getSetPlayerMethod = multiUserSyncGrpc.getSetPlayerMethod) == null) {
      synchronized (multiUserSyncGrpc.class) {
        if ((getSetPlayerMethod = multiUserSyncGrpc.getSetPlayerMethod) == null) {
          multiUserSyncGrpc.getSetPlayerMethod = getSetPlayerMethod = 
              io.grpc.MethodDescriptor.<virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Player, virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "virtual.exhibition.MultiUser.Synchronizer.multiUserSync", "setPlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Player.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new multiUserSyncMethodDescriptorSupplier("setPlayer"))
                  .build();
          }
        }
     }
     return getSetPlayerMethod;
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
    public io.grpc.stub.StreamObserver<virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.RequestPlayer> getPlayer(
        io.grpc.stub.StreamObserver<virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Player> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetPlayerMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Player> setPlayer(
        io.grpc.stub.StreamObserver<virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Response> responseObserver) {
      return asyncUnimplementedStreamingCall(getSetPlayerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPlayerMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.RequestPlayer,
                virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Player>(
                  this, METHODID_GET_PLAYER)))
          .addMethod(
            getSetPlayerMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Player,
                virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Response>(
                  this, METHODID_SET_PLAYER)))
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
    public io.grpc.stub.StreamObserver<virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.RequestPlayer> getPlayer(
        io.grpc.stub.StreamObserver<virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Player> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGetPlayerMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Player> setPlayer(
        io.grpc.stub.StreamObserver<virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Response> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSetPlayerMethod(), getCallOptions()), responseObserver);
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
  }

  private static final int METHODID_GET_PLAYER = 0;
  private static final int METHODID_SET_PLAYER = 1;

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
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PLAYER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getPlayer(
              (io.grpc.stub.StreamObserver<virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Player>) responseObserver);
        case METHODID_SET_PLAYER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.setPlayer(
              (io.grpc.stub.StreamObserver<virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.Response>) responseObserver);
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
      return virtual.exhibition.MultiUser.Synchronizer.MultiUserSync.getDescriptor();
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
              .addMethod(getGetPlayerMethod())
              .addMethod(getSetPlayerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
