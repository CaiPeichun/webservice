package my.client;

import java.io.IOException;
import org.apache.http.client.ClientProtocolException;


import my.service.impl.Hello;
import my.service.impl.Hello_Service;

public class Helloclient {
	public static void main(String[] args) throws ClientProtocolException, IOException {

		Hello_Service factory = new Hello_Service();
		Hello hello = factory.getHelloimplPort();
		String result = hello.sayHello("caipch1");
		System.out.println("client:"+result);
	}
}
