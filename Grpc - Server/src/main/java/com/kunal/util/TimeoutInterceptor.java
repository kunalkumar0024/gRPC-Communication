package com.kunal.util;

import java.util.concurrent.TimeUnit;
import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.MethodDescriptor;

public class TimeoutInterceptor implements ClientInterceptor {
	Long ms;
	public TimeoutInterceptor(Long ms) {
		super();
		this.ms = ms;
	}
	@Override
	public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method,
			CallOptions callOptions, Channel next) {
		return next.newCall(method, callOptions.withDeadlineAfter(ms, TimeUnit.MILLISECONDS));
	}
}
