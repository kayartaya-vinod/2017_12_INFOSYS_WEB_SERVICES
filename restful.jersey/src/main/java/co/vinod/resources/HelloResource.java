package co.vinod.resources;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloResource {

	@GET
	@Produces("text/plain")
	public String sayHello() {
		return "Hello, World!";
	}

	@POST
	@Produces("text/plain")
	public String sayWelcome() {
		return "Welcome to JAX-RS";
	}
}
