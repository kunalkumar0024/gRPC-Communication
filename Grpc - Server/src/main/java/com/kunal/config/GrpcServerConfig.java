package com.kunal.config;

import com.kunal.controller.GrpcController;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.annotation.PreDestroy;
import java.io.IOException;
import java.util.concurrent.Executors;

@Component
public class GrpcServerConfig implements InitializingBean {
        @Autowired
	GrpcController grpcController;
	@Value("${grpc.server.port}")
	private int grpcServerPort;
	@Value("${grpc.server.thread_pool_size}")
	private int threadPoolSize;
	Server server;
	@Override
	public void afterPropertiesSet() throws Exception {
		 server = ServerBuilder.forPort(grpcServerPort)
				 .executor(Executors.newFixedThreadPool(threadPoolSize))
				.addService(grpcController).build();
		try {
			server.start();
			System.out.println("Grpc Server started on port " + server.getPort());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@PreDestroy
	public void onExit() {
		System.out.println("onExit() Shutting down server...");
		Server server = this.server.shutdown();
		System.out.println("onExit() Server termination status: " + server.isTerminated());
		System.out.println("onExit() Server shutdown status: " + server.isShutdown());
	}
}
