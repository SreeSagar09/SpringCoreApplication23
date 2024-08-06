package com.app;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //Using Primary annotation at class level
public class OnlinePayment implements Payment {

	@Override
	public void paymentMode() {
		System.out.println("Payment mode is: Online");
	}

}
