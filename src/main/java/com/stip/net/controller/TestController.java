package com.stip.net.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stip.net.base.StipResponse;
import com.stip.net.service.TestService;

@RequestMapping("/test")
@RestController
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@GetMapping("/getUserInfo")
    public StipResponse getUserInfo() {
		testService.selectByPrimaryKey("1");
		
		return StipResponse.success("success");
    }

}
