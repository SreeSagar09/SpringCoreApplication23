package com.app;

import org.springframework.stereotype.Component;

@Component
public class OfflinePayment implements Payment {

	@Override
	public void paymentMode() {
		System.out.println("Payment mode is: Offline");
	}

}
