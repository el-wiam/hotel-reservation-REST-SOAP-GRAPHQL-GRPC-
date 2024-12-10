package com.example.hotelReservation.Grpc.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: Reservation.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ReservationServiceGrpc {

  private ReservationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ReservationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.hotelReservation.Grpc.generated.Empty,
      com.example.hotelReservation.Grpc.generated.ReservationList> getGetAllReservationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllReservations",
      requestType = com.example.hotelReservation.Grpc.generated.Empty.class,
      responseType = com.example.hotelReservation.Grpc.generated.ReservationList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.hotelReservation.Grpc.generated.Empty,
      com.example.hotelReservation.Grpc.generated.ReservationList> getGetAllReservationsMethod() {
    io.grpc.MethodDescriptor<com.example.hotelReservation.Grpc.generated.Empty, com.example.hotelReservation.Grpc.generated.ReservationList> getGetAllReservationsMethod;
    if ((getGetAllReservationsMethod = ReservationServiceGrpc.getGetAllReservationsMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getGetAllReservationsMethod = ReservationServiceGrpc.getGetAllReservationsMethod) == null) {
          ReservationServiceGrpc.getGetAllReservationsMethod = getGetAllReservationsMethod =
              io.grpc.MethodDescriptor.<com.example.hotelReservation.Grpc.generated.Empty, com.example.hotelReservation.Grpc.generated.ReservationList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllReservations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hotelReservation.Grpc.generated.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hotelReservation.Grpc.generated.ReservationList.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("getAllReservations"))
              .build();
        }
      }
    }
    return getGetAllReservationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.hotelReservation.Grpc.generated.ReservationId,
      com.example.hotelReservation.Grpc.generated.ReservationResponse> getGetReservationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getReservationById",
      requestType = com.example.hotelReservation.Grpc.generated.ReservationId.class,
      responseType = com.example.hotelReservation.Grpc.generated.ReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.hotelReservation.Grpc.generated.ReservationId,
      com.example.hotelReservation.Grpc.generated.ReservationResponse> getGetReservationByIdMethod() {
    io.grpc.MethodDescriptor<com.example.hotelReservation.Grpc.generated.ReservationId, com.example.hotelReservation.Grpc.generated.ReservationResponse> getGetReservationByIdMethod;
    if ((getGetReservationByIdMethod = ReservationServiceGrpc.getGetReservationByIdMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getGetReservationByIdMethod = ReservationServiceGrpc.getGetReservationByIdMethod) == null) {
          ReservationServiceGrpc.getGetReservationByIdMethod = getGetReservationByIdMethod =
              io.grpc.MethodDescriptor.<com.example.hotelReservation.Grpc.generated.ReservationId, com.example.hotelReservation.Grpc.generated.ReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getReservationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hotelReservation.Grpc.generated.ReservationId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hotelReservation.Grpc.generated.ReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("getReservationById"))
              .build();
        }
      }
    }
    return getGetReservationByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.hotelReservation.Grpc.generated.ReservationRequest,
      com.example.hotelReservation.Grpc.generated.ReservationResponse> getCreateReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createReservation",
      requestType = com.example.hotelReservation.Grpc.generated.ReservationRequest.class,
      responseType = com.example.hotelReservation.Grpc.generated.ReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.hotelReservation.Grpc.generated.ReservationRequest,
      com.example.hotelReservation.Grpc.generated.ReservationResponse> getCreateReservationMethod() {
    io.grpc.MethodDescriptor<com.example.hotelReservation.Grpc.generated.ReservationRequest, com.example.hotelReservation.Grpc.generated.ReservationResponse> getCreateReservationMethod;
    if ((getCreateReservationMethod = ReservationServiceGrpc.getCreateReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getCreateReservationMethod = ReservationServiceGrpc.getCreateReservationMethod) == null) {
          ReservationServiceGrpc.getCreateReservationMethod = getCreateReservationMethod =
              io.grpc.MethodDescriptor.<com.example.hotelReservation.Grpc.generated.ReservationRequest, com.example.hotelReservation.Grpc.generated.ReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hotelReservation.Grpc.generated.ReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hotelReservation.Grpc.generated.ReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("createReservation"))
              .build();
        }
      }
    }
    return getCreateReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.hotelReservation.Grpc.generated.ReservationId,
      com.example.hotelReservation.Grpc.generated.Empty> getDeleteReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteReservation",
      requestType = com.example.hotelReservation.Grpc.generated.ReservationId.class,
      responseType = com.example.hotelReservation.Grpc.generated.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.hotelReservation.Grpc.generated.ReservationId,
      com.example.hotelReservation.Grpc.generated.Empty> getDeleteReservationMethod() {
    io.grpc.MethodDescriptor<com.example.hotelReservation.Grpc.generated.ReservationId, com.example.hotelReservation.Grpc.generated.Empty> getDeleteReservationMethod;
    if ((getDeleteReservationMethod = ReservationServiceGrpc.getDeleteReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getDeleteReservationMethod = ReservationServiceGrpc.getDeleteReservationMethod) == null) {
          ReservationServiceGrpc.getDeleteReservationMethod = getDeleteReservationMethod =
              io.grpc.MethodDescriptor.<com.example.hotelReservation.Grpc.generated.ReservationId, com.example.hotelReservation.Grpc.generated.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hotelReservation.Grpc.generated.ReservationId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hotelReservation.Grpc.generated.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("deleteReservation"))
              .build();
        }
      }
    }
    return getDeleteReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.hotelReservation.Grpc.generated.ReservationRequest,
      com.example.hotelReservation.Grpc.generated.ReservationResponse> getModifyReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "modifyReservation",
      requestType = com.example.hotelReservation.Grpc.generated.ReservationRequest.class,
      responseType = com.example.hotelReservation.Grpc.generated.ReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.hotelReservation.Grpc.generated.ReservationRequest,
      com.example.hotelReservation.Grpc.generated.ReservationResponse> getModifyReservationMethod() {
    io.grpc.MethodDescriptor<com.example.hotelReservation.Grpc.generated.ReservationRequest, com.example.hotelReservation.Grpc.generated.ReservationResponse> getModifyReservationMethod;
    if ((getModifyReservationMethod = ReservationServiceGrpc.getModifyReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getModifyReservationMethod = ReservationServiceGrpc.getModifyReservationMethod) == null) {
          ReservationServiceGrpc.getModifyReservationMethod = getModifyReservationMethod =
              io.grpc.MethodDescriptor.<com.example.hotelReservation.Grpc.generated.ReservationRequest, com.example.hotelReservation.Grpc.generated.ReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "modifyReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hotelReservation.Grpc.generated.ReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hotelReservation.Grpc.generated.ReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("modifyReservation"))
              .build();
        }
      }
    }
    return getModifyReservationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReservationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReservationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReservationServiceStub>() {
        @java.lang.Override
        public ReservationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReservationServiceStub(channel, callOptions);
        }
      };
    return ReservationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReservationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReservationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReservationServiceBlockingStub>() {
        @java.lang.Override
        public ReservationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReservationServiceBlockingStub(channel, callOptions);
        }
      };
    return ReservationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReservationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReservationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReservationServiceFutureStub>() {
        @java.lang.Override
        public ReservationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReservationServiceFutureStub(channel, callOptions);
        }
      };
    return ReservationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getAllReservations(com.example.hotelReservation.Grpc.generated.Empty request,
        io.grpc.stub.StreamObserver<com.example.hotelReservation.Grpc.generated.ReservationList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllReservationsMethod(), responseObserver);
    }

    /**
     */
    default void getReservationById(com.example.hotelReservation.Grpc.generated.ReservationId request,
        io.grpc.stub.StreamObserver<com.example.hotelReservation.Grpc.generated.ReservationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReservationByIdMethod(), responseObserver);
    }

    /**
     */
    default void createReservation(com.example.hotelReservation.Grpc.generated.ReservationRequest request,
        io.grpc.stub.StreamObserver<com.example.hotelReservation.Grpc.generated.ReservationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateReservationMethod(), responseObserver);
    }

    /**
     */
    default void deleteReservation(com.example.hotelReservation.Grpc.generated.ReservationId request,
        io.grpc.stub.StreamObserver<com.example.hotelReservation.Grpc.generated.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteReservationMethod(), responseObserver);
    }

    /**
     */
    default void modifyReservation(com.example.hotelReservation.Grpc.generated.ReservationRequest request,
        io.grpc.stub.StreamObserver<com.example.hotelReservation.Grpc.generated.ReservationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyReservationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ReservationService.
   */
  public static abstract class ReservationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ReservationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ReservationService.
   */
  public static final class ReservationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ReservationServiceStub> {
    private ReservationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReservationServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllReservations(com.example.hotelReservation.Grpc.generated.Empty request,
        io.grpc.stub.StreamObserver<com.example.hotelReservation.Grpc.generated.ReservationList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllReservationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getReservationById(com.example.hotelReservation.Grpc.generated.ReservationId request,
        io.grpc.stub.StreamObserver<com.example.hotelReservation.Grpc.generated.ReservationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReservationByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createReservation(com.example.hotelReservation.Grpc.generated.ReservationRequest request,
        io.grpc.stub.StreamObserver<com.example.hotelReservation.Grpc.generated.ReservationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteReservation(com.example.hotelReservation.Grpc.generated.ReservationId request,
        io.grpc.stub.StreamObserver<com.example.hotelReservation.Grpc.generated.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void modifyReservation(com.example.hotelReservation.Grpc.generated.ReservationRequest request,
        io.grpc.stub.StreamObserver<com.example.hotelReservation.Grpc.generated.ReservationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyReservationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ReservationService.
   */
  public static final class ReservationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ReservationServiceBlockingStub> {
    private ReservationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReservationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.hotelReservation.Grpc.generated.ReservationList getAllReservations(com.example.hotelReservation.Grpc.generated.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllReservationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.hotelReservation.Grpc.generated.ReservationResponse getReservationById(com.example.hotelReservation.Grpc.generated.ReservationId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReservationByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.hotelReservation.Grpc.generated.ReservationResponse createReservation(com.example.hotelReservation.Grpc.generated.ReservationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.hotelReservation.Grpc.generated.Empty deleteReservation(com.example.hotelReservation.Grpc.generated.ReservationId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.hotelReservation.Grpc.generated.ReservationResponse modifyReservation(com.example.hotelReservation.Grpc.generated.ReservationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyReservationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ReservationService.
   */
  public static final class ReservationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ReservationServiceFutureStub> {
    private ReservationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReservationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.hotelReservation.Grpc.generated.ReservationList> getAllReservations(
        com.example.hotelReservation.Grpc.generated.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllReservationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.hotelReservation.Grpc.generated.ReservationResponse> getReservationById(
        com.example.hotelReservation.Grpc.generated.ReservationId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReservationByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.hotelReservation.Grpc.generated.ReservationResponse> createReservation(
        com.example.hotelReservation.Grpc.generated.ReservationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.hotelReservation.Grpc.generated.Empty> deleteReservation(
        com.example.hotelReservation.Grpc.generated.ReservationId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.hotelReservation.Grpc.generated.ReservationResponse> modifyReservation(
        com.example.hotelReservation.Grpc.generated.ReservationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyReservationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_RESERVATIONS = 0;
  private static final int METHODID_GET_RESERVATION_BY_ID = 1;
  private static final int METHODID_CREATE_RESERVATION = 2;
  private static final int METHODID_DELETE_RESERVATION = 3;
  private static final int METHODID_MODIFY_RESERVATION = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_RESERVATIONS:
          serviceImpl.getAllReservations((com.example.hotelReservation.Grpc.generated.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.hotelReservation.Grpc.generated.ReservationList>) responseObserver);
          break;
        case METHODID_GET_RESERVATION_BY_ID:
          serviceImpl.getReservationById((com.example.hotelReservation.Grpc.generated.ReservationId) request,
              (io.grpc.stub.StreamObserver<com.example.hotelReservation.Grpc.generated.ReservationResponse>) responseObserver);
          break;
        case METHODID_CREATE_RESERVATION:
          serviceImpl.createReservation((com.example.hotelReservation.Grpc.generated.ReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.example.hotelReservation.Grpc.generated.ReservationResponse>) responseObserver);
          break;
        case METHODID_DELETE_RESERVATION:
          serviceImpl.deleteReservation((com.example.hotelReservation.Grpc.generated.ReservationId) request,
              (io.grpc.stub.StreamObserver<com.example.hotelReservation.Grpc.generated.Empty>) responseObserver);
          break;
        case METHODID_MODIFY_RESERVATION:
          serviceImpl.modifyReservation((com.example.hotelReservation.Grpc.generated.ReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.example.hotelReservation.Grpc.generated.ReservationResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetAllReservationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.hotelReservation.Grpc.generated.Empty,
              com.example.hotelReservation.Grpc.generated.ReservationList>(
                service, METHODID_GET_ALL_RESERVATIONS)))
        .addMethod(
          getGetReservationByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.hotelReservation.Grpc.generated.ReservationId,
              com.example.hotelReservation.Grpc.generated.ReservationResponse>(
                service, METHODID_GET_RESERVATION_BY_ID)))
        .addMethod(
          getCreateReservationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.hotelReservation.Grpc.generated.ReservationRequest,
              com.example.hotelReservation.Grpc.generated.ReservationResponse>(
                service, METHODID_CREATE_RESERVATION)))
        .addMethod(
          getDeleteReservationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.hotelReservation.Grpc.generated.ReservationId,
              com.example.hotelReservation.Grpc.generated.Empty>(
                service, METHODID_DELETE_RESERVATION)))
        .addMethod(
          getModifyReservationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.hotelReservation.Grpc.generated.ReservationRequest,
              com.example.hotelReservation.Grpc.generated.ReservationResponse>(
                service, METHODID_MODIFY_RESERVATION)))
        .build();
  }

  private static abstract class ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReservationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.hotelReservation.Grpc.generated.Reservation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReservationService");
    }
  }

  private static final class ReservationServiceFileDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier {
    ReservationServiceFileDescriptorSupplier() {}
  }

  private static final class ReservationServiceMethodDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ReservationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ReservationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReservationServiceFileDescriptorSupplier())
              .addMethod(getGetAllReservationsMethod())
              .addMethod(getGetReservationByIdMethod())
              .addMethod(getCreateReservationMethod())
              .addMethod(getDeleteReservationMethod())
              .addMethod(getModifyReservationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
