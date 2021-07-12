package com.example.Coupon.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/couponDetails")
public class CouponController {


	@Value("${eureka.instance.instance-id}")
	private String eurekaInstanceId;
	
	@Value("${server.port}")
	private String port;

	@GetMapping("/coupon/{couponCode}")
	public String getDetails(@PathVariable String couponCode) {
		System.out.println("ID " + eurekaInstanceId);
		System.out.println("couponCode " + couponCode);
		return "Welcome to COUPON " + eurekaInstanceId + " World";

	}

}
