package com.ep1ct3t.grpcclient;

import com.ep1ct3t.grpcclient.service.GreeterClient;
import net.devh.boot.grpc.client.autoconfigure.GrpcClientAutoConfiguration;
import org.example.HelloWorldServiceGrpc;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//@Import(GrpcClientAutoConfiguration.class)
public class GrpcClientApplication   {

    public static void main(String[] args) {
        SpringApplication.run(GrpcClientApplication.class, args);
    }

}
