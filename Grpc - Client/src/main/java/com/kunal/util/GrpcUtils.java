package com.kunal.util;

import com.kunal.grpccleint.AepsTransaction;
import io.grpc.ManagedChannel;
import io.grpc.netty.NettyChannelBuilder;
import io.netty.channel.ChannelOption;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class GrpcUtils {
    private static Logger logger = LoggerFactory.getLogger(GrpcUtils.class);
    public static ManagedChannel getGrpcNettyChannel(String ip, int port, int second) {
        return NettyChannelBuilder.forAddress(ip, port).usePlaintext()
                .withOption(ChannelOption.CONNECT_TIMEOUT_MILLIS, (int) TimeUnit.SECONDS.toMillis(second)).build();
    }
    public static AepsTransaction.TransactionRequest prepareGrpcTransactionRequest(String aepsRequest) {
        return AepsTransaction.TransactionRequest.newBuilder()
                .setRequest(aepsRequest)
                .build();
    }
    public static String handleGrpcResponse(AepsTransaction.TransactionResponse transactionResponse) {
        String gatewayResponse = transactionResponse.getResponse();
        return gatewayResponse;
    }
}
