package com.ep1ct3t.grpcclient.rest;

import com.ep1ct3t.grpcclient.service.GreeterClient;
import com.google.api.Http;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ClientRestController {
    private final GreeterClient greeterClient;
    @GetMapping
    public ResponseEntity<?> greeting(){
        greeterClient.sayHello("CLIENT", "Hello, it's client message!");
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
