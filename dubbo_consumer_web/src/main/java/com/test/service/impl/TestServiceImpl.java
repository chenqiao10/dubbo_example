package com.test.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.test.dubbo.service.DemoService;
import com.test.service.TestService;

@Service
public class TestServiceImpl implements TestService{
    @Reference
	private DemoService  demoService;
	public void test() {
		// TODO Auto-generated method stub
		String name=demoService.Demo("李四");
		System.out.println(name);
	}
 
}
