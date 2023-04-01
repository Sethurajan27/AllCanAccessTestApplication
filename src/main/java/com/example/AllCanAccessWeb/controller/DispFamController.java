package com.example.AllCanAccessWeb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DispFamController {
	@GetMapping("/fam")
	public String display() {
		return "Ravi S\n Dhavamani R\n Rajkumar R\n Sethurajan R\n Jayashree R\n Ram K\n Rubi A M";
	}
}
