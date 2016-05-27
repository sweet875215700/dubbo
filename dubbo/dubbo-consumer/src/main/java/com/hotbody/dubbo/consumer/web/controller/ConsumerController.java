package com.hotbody.dubbo.consumer.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hotbody.duboo.service.HelloService;

@Controller
public class ConsumerController {
	
	@Resource(name = "helloService")
	private HelloService helloService;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(HttpServletRequest request, ModelMap model) {
		
		String name = helloService.sayHello("hello word!!");
		System.out.println("结果: " + name);
		model.addAttribute("name", name);
		return "/index";
	}

}
