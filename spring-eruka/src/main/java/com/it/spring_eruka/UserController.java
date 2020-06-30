package com.it.spring_eruka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	//@GetMapping("/queryall")
	@RequestMapping(value = "/queryall", method = RequestMethod.GET)
	public String getUser() {
		return "我是eruka服务端";
	}

}
