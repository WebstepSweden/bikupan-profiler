package se.diversify.bikupan.resources;

import com.google.common.collect.ImmutableMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/computer")
@Produces("application/json;charset=UTF-8")
public class HelloWorldResource {


    public HelloWorldResource() {
        // Empty by design
    }

    @GET
    @Path("/says")
    public Response getPlayingRounds() {
        return Response.ok(ImmutableMap.of("message", "Says hello to Uzi")).build();
    }

}
