package com.hotbody.dubbo.consumer;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.hotbody.dubbo.service.HelloService;

public class consumerAction {
	
	private HelloService demoService;

    

	public HelloService getDemoService() {
		return demoService;
	}



	public void setDemoService(HelloService demoService) {
		this.demoService = demoService;
	}



	public void start() throws Exception {
        for (int i = 0; i < Integer.MAX_VALUE; i ++) {
            try {
            	String hello = demoService.sayHello("world" + i);
                System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] " + hello);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Thread.sleep(2000);
        }
	}

}
