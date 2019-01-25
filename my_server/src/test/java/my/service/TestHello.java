package my.service;

import javax.xml.ws.Endpoint;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;


import my.service.impl.Helloimpl;

public class TestHello {

	public static void main(String[] args) {
		System.out.println("start");
		Helloimpl helloimpl = new Helloimpl();
		String address = "http://localhost:8000/my_server/hello";
		Endpoint.publish(address, helloimpl);
		System.out.println("发布服务");
	}

}
