package my.service.impl;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import my.service.Hello;
@WebService(endpointInterface="my.service.Hello",serviceName="Hello")
public class Helloimpl implements Hello{

	public String sayHello(String name) {
		System.out.println("这是hello服务");
		return "hello"+name;
	}

	
}
