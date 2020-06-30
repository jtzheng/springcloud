package com.it.springcloud_eruka_client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {
	
	
	@RequestMapping(value = "/getClient" ,method = RequestMethod.GET)
	public String getClient() {
		return "我是erueka客户端";
	}

}
