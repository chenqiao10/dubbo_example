package com.test.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.service.TestService;

@Controller
public class TestController {
	@Resource
	private TestService testService;
   @RequestMapping("/test")
	public String test() {
		testService.test();
		return "/main.jsp";

	}
}
