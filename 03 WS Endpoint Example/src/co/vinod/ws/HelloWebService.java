package co.vinod.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(
	name = "HelloServiceSoap", // this is going to be the client-side interface name (wsdl, portType)
	serviceName = "HelloService", // this is going to be the client-side factory class (wsdl, service)
	portName = "HelloServiceSoap" // this is one of the mehtod in the HelloService class that returns HelloServiceSaop object
)
public class HelloWebService {

	public HelloWebService() {
	}

	@WebMethod(operationName = "say-hello", action = "sayHelloAction")
	@WebResult(name = "message")
	public String sayHello(@WebParam(name="name") String name, @WebParam(name="city")String city) {
		return String.format("Hello %s! How's weather in %s?", name, city);
	}
}
