package co.vinod.ws;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

// handler chain xml should be in the buildpath
@HandlerChain(file = "my-custom-handlers.xml")
@WebService(name = "HelloWorldSoap", serviceName = "HelloWorld", portName = "HelloWorldSoap")
public class HelloWorldEndpoint {

	@WebMethod(operationName = "say-hello")
	@WebResult(name = "greeting")
	public String sayHello(@WebParam(name = "name") String name) {
		System.out.println("Entering the sayHello() method..");
		String msg = String.format("Hello, %s!", name);
		System.out.println("Returning from the sayHello() method..");
		return msg;
	}

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1234/hello-service", new HelloWorldEndpoint());
		System.out.println("WS is published here: http://localhost:1234/hello-service");
	}
}
