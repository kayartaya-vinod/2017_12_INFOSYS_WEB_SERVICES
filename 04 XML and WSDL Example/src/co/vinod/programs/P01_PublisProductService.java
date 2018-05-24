package co.vinod.programs;

import javax.xml.ws.Endpoint;

import co.vinod.ws.endpoint.ProductServiceEndpoint;

public class P01_PublisProductService {
	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:2233/ws/product-service", 
				new ProductServiceEndpoint());
		
		System.out.println("Service deployed");
		
		
	}
}
