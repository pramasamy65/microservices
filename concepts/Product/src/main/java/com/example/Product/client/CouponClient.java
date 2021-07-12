package com.example.Product.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("coupon-service")
public interface CouponClient {

	@GetMapping("/couponDetails/coupon/{couponCode}")
	public String getDetails(@PathVariable String couponCode);
}
