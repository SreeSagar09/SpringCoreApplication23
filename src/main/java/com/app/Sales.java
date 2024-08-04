package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Sales {
	
	@Autowired
	private Product product;
	
	@Autowired
	private Payment payment;
	
	public void getProductDetails() {
		System.out.println(product);
	}
	
	public void getPaymentDetails() {
		payment.paymentMode();
	}
}
