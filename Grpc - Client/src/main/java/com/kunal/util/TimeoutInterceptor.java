package com.kunal.util;

import io.grpc.*;

import java.util.concurrent.TimeUnit;

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
