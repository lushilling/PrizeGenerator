package com.qa.service;

import org.springframework.stereotype.Service;

@Service
public class PrizeServiceImplmented implements PrizeService {

	@Override
	public String prizeGenerator(String accountNumber) {

		String result = "";

		switch (accountNumber.charAt(0)) {
		case 'a':
			result = "You Won $0";
			break;
		case 'b':
			if (accountNumber.length() == 7) {
				result = "You Won $50";
				break;
			} else if (accountNumber.length() == 9) {
				result = "You Won $500";
				break;
			} else {
				result = "You Won $5000";
				break;
			}
		case 'c':
			if (accountNumber.length() == 7) {
				result = "You Won $100";
				break;
			} else if (accountNumber.length() == 9) {
				result = "You Won $750";
				break;
			} else {
				result = "You Won $10000";
				break;
			}
		}
		return result;
	}

}