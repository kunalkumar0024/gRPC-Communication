package com.kunal.service.impl;


import com.kunal.grpccleint.AepsTansactionGrpc;
import com.kunal.grpccleint.AepsTransaction;
import com.kunal.service.GrpcService;
import com.kunal.util.GrpcUtils;
import com.kunal.util.TimeoutInterceptor;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrpcServiceImpl implements GrpcService {
    private Logger logger = LoggerFactory.getLogger(GrpcServiceImpl.class);
    @Autowired
    private ManagedChannel channel;
    @Override
    public String processTransactionRequest(String request) {
       try {
            request = "Grpc client request to the server";
            AepsTransaction.TransactionRequest transactionRequest = GrpcUtils.prepareGrpcTransactionRequest(request);
            logger.info("Grpc request sent to the server : " + transactionRequest);
            AepsTansactionGrpc.AepsTansactionBlockingStub aepsStub = AepsTansactionGrpc.newBlockingStub(channel)
                    .withInterceptors(new TimeoutInterceptor(60000l));
            long startTime = System.currentTimeMillis();
            logger.info("Start Time : " + startTime);
            AepsTransaction.TransactionResponse transactionResponse = aepsStub.processTransaction(transactionRequest);
            logger.info("Grpc response received in " + (System.currentTimeMillis() - startTime) + " milliseconds");
            logger.info("Grpc response received from the Server : " + transactionResponse);
            String gatewayResponse = GrpcUtils.handleGrpcResponse(transactionResponse);
            return gatewayResponse;
        } catch (StatusRuntimeException statusException) {
           logger.info("Status Run Time Exception : ", statusException.getMessage());
           return "Status Run Time Exception";
        } catch (Exception e) {
            logger.info("Unknown Exception : " + e.getMessage());
            String gatewayResponse = "Unknown Exception";
            return gatewayResponse;
        }
    }
}
