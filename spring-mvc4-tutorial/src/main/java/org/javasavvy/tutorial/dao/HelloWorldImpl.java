package org.javasavvy.tutorial.dao;

import org.springframework.stereotype.Service;

@Service("helloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String sayHello(String msg) {
		// TODO Auto-generated method stub
		return msg;
	}

}
