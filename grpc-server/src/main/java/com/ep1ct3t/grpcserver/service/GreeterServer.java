package com.ep1ct3t.grpcserver.service;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.example.HelloWorldRequest;
import org.example.HelloWorldResponse;
import org.example.HelloWorldServiceGrpc.HelloWorldServiceImplBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@GrpcService
public class GreeterServer extends HelloWorldServiceImplBase {
    private static final Logger logger = LoggerFactory.getLogger(GreeterServer.class);

    @Override
    public void helloWorld(HelloWorldRequest request, StreamObserver<HelloWorldResponse> responseObserver) {
        HelloWorldResponse setResponseMessage = HelloWorldResponse.newBuilder()
                .setResponseMessage("Hello " + request.getClientName() + " !!!").build();
        logger.info(String.format("%1s sent a message: %1s", request.getClientName(),request.getRequestMessage()));
        responseObserver.onNext(setResponseMessage);
        responseObserver.onCompleted();
    }

}