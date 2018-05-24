package co.vinod.programs;

import javax.xml.ws.Endpoint;

import co.vinod.ws.HelloWebService;

public class P01_PublishService {

	public static void main(String[] args) {
		
		String endpointAddress = "http://localhost:8080/hello-service";
		Object implementor = new HelloWebService();
		
		Endpoint.publish(endpointAddress, implementor);
		System.out.println("Service started and visit http://localhost:8080/hello-service?wsdl to access the service description.");
	}
}
