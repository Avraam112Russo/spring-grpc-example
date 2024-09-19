package com.ep1ct3t.grpcclient.service;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.example.HelloWorldRequest;
import org.example.HelloWorldResponse;
import org.example.HelloWorldServiceGrpc.HelloWorldServiceBlockingStub;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
@Service
public class GreeterClient {
    private static final Logger logger = LoggerFactory.getLogger(GreeterClient.class);

    @GrpcClient("grpc-server")
    private HelloWorldServiceBlockingStub helloWorldServiceStub;

    public void sayHello(String sender, String message) {
        HelloWorldRequest helloWorldRequest = HelloWorldRequest.newBuilder().setClientName(sender)
                .setRequestMessage(message).build();
        HelloWorldResponse helloWorldResponse = this.helloWorldServiceStub.helloWorld(helloWorldRequest);
        logger.info(String.format("Server sent a response: %1s", helloWorldResponse.getResponseMessage()));
    }

}
