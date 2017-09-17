package com.dell.emc.accounts.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@RequestMapping("/account")
	public String getAccountName() {		
		return "Hi ";
	}
	@RequestMapping("/shishir")
	public String getName() {
		return "Hi Shishir";
	}
}
