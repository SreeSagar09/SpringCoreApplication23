package com.app;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class OnlinePayment implements Payment {

	@Override
	public void paymentMode() {
		System.out.println("Payment mode is: Online");
	}

}
