package com.javahangout.retail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javahangout.retail.model.CreateNewValueChainReq;
import com.javahangout.retail.model.CreateNewValueChainRes;
import com.javahangout.retail.service.MVTService;

@RestController
public class MVTController {
	
	@Autowired
	MVTService service;

	@PostMapping("/mvt/create")
	public CreateNewValueChainRes createNewValueChain(@RequestBody CreateNewValueChainReq chainReq) {
		CreateNewValueChainRes chainRes = service.createNewValueChain(chainReq);

		return chainRes;

	}

	@GetMapping("/hello")
	public String greets() {
		return "Hello, welcome to MVT World";
	}

}
