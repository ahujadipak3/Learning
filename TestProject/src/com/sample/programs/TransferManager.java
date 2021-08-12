package com.sample.programs;

public class TransferManager {
	//Authentication auth;
	
	
	public TransferManager() {
		// TODO Auto-generated constructor stub
		//this.auth = auth;
	}
	
	public void transfer(TransferRequest request) {
		Authentication auth = AuthenticationFactory.getAuthentication(request.getCustomerType());
		auth.authenticate();
	}
	
	// Mode.. REST Native
	// 
	public static void main(String[] args) {
		TransferManager manager =  new TransferManager();
		TransferRequest request = new TransferRequest();
		request.setCustomerType("High Risk");
		manager.transfer(request);
	}
}
