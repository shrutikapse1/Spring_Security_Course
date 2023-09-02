package com.springsecuritysection2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
	@GetMapping("/contact")
	public String saveContactEnquiryDetails() {
		return "Inquiry details are saved to the DB";
	}
}
