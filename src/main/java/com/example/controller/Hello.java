package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.config.DemoConfig;




@RestController
@RequestMapping("/wechat/coupons")
@EnableConfigurationProperties(DemoConfig.class)

public class Hello {

	@Autowired
	DemoConfig demoConfig;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseWrapper getAppName() {
		return new ResponseWrapper(demoConfig.getAppName());
	}
	
}
