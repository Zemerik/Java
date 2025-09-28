/**
 * Day 48 - RESTAPIDemo.java
 * Demonstrates REST API with JAX-RS
 */
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api")
public class RESTAPIDemo {
    
    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello() {
        return "Hello, REST API!";
    }
    
    @GET
    @Path("/users/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUser(@PathParam("id") int id) {
        // Simulate user data
        String user = "{\"id\": " + id + ", \"name\": \"User " + id + "\"}";
        return Response.ok(user).build();
    }
    
    @POST
    @Path("/users")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createUser(String userData) {
        // Process user creation
        return Response.status(Response.Status.CREATED)
                       .entity("{\"message\": \"User created\", \"data\": " + userData + "}")
                       .build();
    }
    
    @PUT
    @Path("/users/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateUser(@PathParam("id") int id, String userData) {
        // Process user update
        return Response.ok("{\"message\": \"User " + id + " updated\"}").build();
    }
    
    @DELETE
    @Path("/users/{id}")
    public Response deleteUser(@PathParam("id") int id) {
        // Process user deletion
        return Response.ok("{\"message\": \"User " + id + " deleted\"}").build();
    }
} 