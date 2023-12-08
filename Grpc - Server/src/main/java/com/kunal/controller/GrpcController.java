package com.kunal.controller;

import com.kunal.grpccleint.AepsTansactionGrpc;
import com.kunal.grpccleint.AepsTransaction;
import com.kunal.util.ConsumerUtility;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class GrpcController extends AepsTansactionGrpc.AepsTansactionImplBase {
    Logger logger = LoggerFactory.getLogger(GrpcController.class);
    @Override
    public void processTransaction(AepsTransaction.TransactionRequest request, StreamObserver<AepsTransaction.TransactionResponse> responseObserver) {
        long startTime = System.currentTimeMillis();
        String aepsRequestMessageModel = ConsumerUtility.prepareTransactionRequest(request);
        logger.info("Transaction Request Received: " + aepsRequestMessageModel);
        String randomID = String.valueOf(Math.random());
        String response = "Response from the server : " + randomID;
        AepsTransaction.TransactionResponse transactionResponse = ConsumerUtility.prepareGrpcTxnResponse(response);
        logger.info("Response sent back to the client : " + transactionResponse );
        responseObserver.onNext(transactionResponse);
        responseObserver.onCompleted();
    }
}
