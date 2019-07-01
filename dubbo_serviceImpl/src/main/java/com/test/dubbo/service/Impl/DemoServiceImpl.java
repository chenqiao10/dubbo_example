package com.test.dubbo.service.Impl;

import com.test.dubbo.service.DemoService;
public class DemoServiceImpl implements DemoService{

	public String Demo(String name) {
		// TODO Auto-generated method stub
		return "收到"+name;
	}

}
