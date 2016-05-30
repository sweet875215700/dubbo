package com.hotbody.dubbo.Bootstrap;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Bootstrap{
	
	public static void main(String[] args) throws IOException {
		System.out.println("服务启动ing...");
//      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"http://10.20.160.198/wiki/display/dubbo/provider.xml"});
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-provider.xml"});
		context.start();
		//按任意键退出
		System.in.read();
	}

}
