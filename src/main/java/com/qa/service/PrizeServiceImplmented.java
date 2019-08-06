package com.qa.service;

import org.springframework.stereotype.Service;

@Service
public class PrizeServiceImplmented implements PrizeService {

	@Override
	public String prizeGenerator(String accountNumber) {

		switch (accountNumber.charAt(0)) {
		case 'A':
			return "You Won $0";
		case 'B':
			if (accountNumber.length() == 7) {
				return "You Won $50";
			} else if (accountNumber.length() == 9) {
				return "You Won $500";
			} else
				return "You Won $5000";
		case 'C':
			if (accountNumber.length() == 7) {
				return "You Won $100";
			} else if (accountNumber.length() == 9) {
				return "You Won $750";
			} else
				return "You Won $10000";
		}
		return "";
	}

}