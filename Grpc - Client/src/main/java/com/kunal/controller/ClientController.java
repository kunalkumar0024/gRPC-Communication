package com.kunal.controller;

import com.kunal.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    GrpcService grpcService;
    @PostMapping("/grpcRequest")
    public ResponseEntity<String> callServer(){
        String request = "Request to the server";
        String response = grpcService.processTransactionRequest(request);

        return ResponseEntity.ok(response);
    }


}
