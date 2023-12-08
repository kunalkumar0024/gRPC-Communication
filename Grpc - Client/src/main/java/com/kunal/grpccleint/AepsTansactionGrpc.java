package com.kunal.grpccleint;

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
    value = "by gRPC proto compiler (version 1.33.0)",
    comments = "Source: aepsTransaction.proto")
public final class AepsTansactionGrpc {

  private AepsTansactionGrpc() {}

  public static final String SERVICE_NAME = "AepsTansaction";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.kunal.grpccleint.AepsTransaction.TransactionRequest,
      com.kunal.grpccleint.AepsTransaction.TransactionResponse> getProcessTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "processTransaction",
      requestType = com.kunal.grpccleint.AepsTransaction.TransactionRequest.class,
      responseType = com.kunal.grpccleint.AepsTransaction.TransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kunal.grpccleint.AepsTransaction.TransactionRequest,
      com.kunal.grpccleint.AepsTransaction.TransactionResponse> getProcessTransactionMethod() {
    io.grpc.MethodDescriptor<com.kunal.grpccleint.AepsTransaction.TransactionRequest, com.kunal.grpccleint.AepsTransaction.TransactionResponse> getProcessTransactionMethod;
    if ((getProcessTransactionMethod = AepsTansactionGrpc.getProcessTransactionMethod) == null) {
      synchronized (AepsTansactionGrpc.class) {
        if ((getProcessTransactionMethod = AepsTansactionGrpc.getProcessTransactionMethod) == null) {
          AepsTansactionGrpc.getProcessTransactionMethod = getProcessTransactionMethod =
              io.grpc.MethodDescriptor.<com.kunal.grpccleint.AepsTransaction.TransactionRequest, com.kunal.grpccleint.AepsTransaction.TransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "processTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kunal.grpccleint.AepsTransaction.TransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kunal.grpccleint.AepsTransaction.TransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AepsTansactionMethodDescriptorSupplier("processTransaction"))
              .build();
        }
      }
    }
    return getProcessTransactionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AepsTansactionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AepsTansactionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AepsTansactionStub>() {
        @java.lang.Override
        public AepsTansactionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AepsTansactionStub(channel, callOptions);
        }
      };
    return AepsTansactionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AepsTansactionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AepsTansactionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AepsTansactionBlockingStub>() {
        @java.lang.Override
        public AepsTansactionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AepsTansactionBlockingStub(channel, callOptions);
        }
      };
    return AepsTansactionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AepsTansactionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AepsTansactionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AepsTansactionFutureStub>() {
        @java.lang.Override
        public AepsTansactionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AepsTansactionFutureStub(channel, callOptions);
        }
      };
    return AepsTansactionFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AepsTansactionImplBase implements io.grpc.BindableService {

    /**
     */
    public void processTransaction(com.kunal.grpccleint.AepsTransaction.TransactionRequest request,
        io.grpc.stub.StreamObserver<com.kunal.grpccleint.AepsTransaction.TransactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getProcessTransactionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProcessTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kunal.grpccleint.AepsTransaction.TransactionRequest,
                com.kunal.grpccleint.AepsTransaction.TransactionResponse>(
                  this, METHODID_PROCESS_TRANSACTION)))
          .build();
    }
  }

  /**
   */
  public static final class AepsTansactionStub extends io.grpc.stub.AbstractAsyncStub<AepsTansactionStub> {
    private AepsTansactionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AepsTansactionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AepsTansactionStub(channel, callOptions);
    }

    /**
     */
    public void processTransaction(com.kunal.grpccleint.AepsTransaction.TransactionRequest request,
        io.grpc.stub.StreamObserver<com.kunal.grpccleint.AepsTransaction.TransactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProcessTransactionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AepsTansactionBlockingStub extends io.grpc.stub.AbstractBlockingStub<AepsTansactionBlockingStub> {
    private AepsTansactionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AepsTansactionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AepsTansactionBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.kunal.grpccleint.AepsTransaction.TransactionResponse processTransaction(com.kunal.grpccleint.AepsTransaction.TransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), getProcessTransactionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AepsTansactionFutureStub extends io.grpc.stub.AbstractFutureStub<AepsTansactionFutureStub> {
    private AepsTansactionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AepsTansactionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AepsTansactionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kunal.grpccleint.AepsTransaction.TransactionResponse> processTransaction(
        com.kunal.grpccleint.AepsTransaction.TransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getProcessTransactionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROCESS_TRANSACTION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AepsTansactionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AepsTansactionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PROCESS_TRANSACTION:
          serviceImpl.processTransaction((com.kunal.grpccleint.AepsTransaction.TransactionRequest) request,
              (io.grpc.stub.StreamObserver<com.kunal.grpccleint.AepsTransaction.TransactionResponse>) responseObserver);
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

  private static abstract class AepsTansactionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AepsTansactionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.kunal.grpccleint.AepsTransaction.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AepsTansaction");
    }
  }

  private static final class AepsTansactionFileDescriptorSupplier
      extends AepsTansactionBaseDescriptorSupplier {
    AepsTansactionFileDescriptorSupplier() {}
  }

  private static final class AepsTansactionMethodDescriptorSupplier
      extends AepsTansactionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AepsTansactionMethodDescriptorSupplier(String methodName) {
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
      synchronized (AepsTansactionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AepsTansactionFileDescriptorSupplier())
              .addMethod(getProcessTransactionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
