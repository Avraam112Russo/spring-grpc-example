//package com.ep1ct3t.grpcclient.config;
//
//import com.ep1ct3t.grpcclient.service.GreeterClient;
//import net.devh.boot.grpc.client.inject.GrpcClient;
//import net.devh.boot.grpc.client.inject.GrpcClientBean;
//import org.example.HelloWorldServiceGrpc;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@GrpcClientBean(
//        clazz = HelloWorldServiceGrpc.HelloWorldServiceBlockingStub.class,
//        beanName = "blockingStub",
//        client = @GrpcClient("grpc-server")
//)
//public class MyConfig {
//    @Bean
//    public GreeterClient greeterClient(@Autowired HelloWorldServiceGrpc.HelloWorldServiceBlockingStub blockingStub) {
//        return new GreeterClient(blockingStub);
//    }
//}
