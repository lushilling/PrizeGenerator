package com.qa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.service.PrizeService;

@RestController
@RequestMapping("/prize")
public class PrizeController {
	
	@Autowired
	public PrizeService prizeService;
	
	@RequestMapping("/getPrize/{accountNumber}")
	public String prizeGenerator(@PathVariable String accountNumber) {
		return prizeService.prizeGenerator(accountNumber);
	}
	
}
