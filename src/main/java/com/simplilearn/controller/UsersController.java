package com.simplilearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

	@GetMapping("/users/status/check")
	public static String status() {
		return "Working..";
	}
}
