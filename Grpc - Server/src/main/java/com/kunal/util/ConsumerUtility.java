package com.kunal.util;

import com.kunal.grpccleint.AepsTransaction;

public class ConsumerUtility {
	public static String prepareTransactionRequest(AepsTransaction.TransactionRequest transactionRequest) {
		String aepsRequest = transactionRequest.getRequest();
		return aepsRequest;
	}
	public static AepsTransaction.TransactionResponse prepareGrpcTxnResponse(String callback) {
		return AepsTransaction.TransactionResponse.newBuilder()
				.setResponse(callback)
				.build();
	}
}
