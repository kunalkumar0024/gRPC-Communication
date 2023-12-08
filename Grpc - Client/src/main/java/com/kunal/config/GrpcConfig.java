package com.kunal.config;

import io.grpc.ManagedChannel;
import io.grpc.netty.NettyChannelBuilder;
import io.netty.channel.ChannelOption;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import java.util.concurrent.TimeUnit;

@Configuration
public class GrpcConfig {
    @Value("${consumer.grpc.server.port}")
    private Integer consumerGrpcServerPort;
    @Value("${consumer.grpc.server.ip}")
    private String consumerGrpcServerIp;
    @Bean("channel")
    @Profile("prod | dev ")
    public ManagedChannel getSslGrpcNettyChannel() {
        return getNettyChannelBuilder()
                .useTransportSecurity()
                .build();
    }
    @Bean("channel")
    @Profile("local")
    public ManagedChannel getPlainTextGrpcNettyChannel() {
        return getNettyChannelBuilder()
                .usePlaintext()
                .build();
    }
    public NettyChannelBuilder getNettyChannelBuilder() {
        return NettyChannelBuilder
                .forAddress(consumerGrpcServerIp, consumerGrpcServerPort)
                .withOption(ChannelOption.CONNECT_TIMEOUT_MILLIS,
                        (int) TimeUnit.SECONDS.toMillis(180));
    }
}
