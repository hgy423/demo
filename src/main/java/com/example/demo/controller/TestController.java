package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.TestDto;
import com.example.demo.service.TestService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@GetMapping("/")
	public Object test() {
		return "Hello World!";
	}
	
	@GetMapping("/user")
	public List<TestDto> getUser() {
		return testService.getUserList();
	}
}
