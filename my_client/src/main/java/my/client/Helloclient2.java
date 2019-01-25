package my.client;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import my.service.impl.Hello;
import my.service.impl.Hello_Service;

public class Helloclient2 {
	public static void main(String[] args) throws ClientProtocolException, IOException {
		String url = "http://localhost:8000/my_server/hello";
		HttpClient httpClient = HttpClients.createDefault();
		
		HttpGet  request = new HttpGet(url);
	
		HttpResponse response = httpClient.execute(request);
	
		System.out.println("----------");
		String result = EntityUtils.toString(response.getEntity());
		

	}
}
