package com.example.Product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Product.client.CouponClient;

@RestController
@RequestMapping("/productDetails")
public class ProductController {

	@Autowired
	CouponClient client;

	@GetMapping("/product/{productName}")
	public String getDetails(@PathVariable String productName) {
		
		return client.getDetails(productName) + " & PRODUCT " + productName + " World";

	}

}
