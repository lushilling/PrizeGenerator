package com.qa.service;

import org.springframework.stereotype.Service;

@Service
public class PrizeServiceImplmented implements PrizeService {

	@Override
	public String prizeGenerator(String accountNumber) {

		switch (accountNumber.charAt(0)) {
		case 'A':
			return "You Won $50";
		case 'B':
			return "You Won $100";
		case 'C':
			return "lose";

		}
		return "";
	}

}