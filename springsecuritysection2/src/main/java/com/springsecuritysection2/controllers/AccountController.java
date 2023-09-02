package com.springsecuritysection2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	@GetMapping("/myAccount")
	public String getAccountDetails() {
		return "Here are the account details";
	}

}
