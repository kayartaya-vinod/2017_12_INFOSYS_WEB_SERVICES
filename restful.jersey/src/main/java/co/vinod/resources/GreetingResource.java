package co.vinod.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import co.vinod.entity.Greeting;

@Path("/greeting")
public class GreetingResource {

	@GET
	@Produces({ "application/xml", "application/json" })
	public Greeting getGreeting() {
		return new Greeting();
	}
}
