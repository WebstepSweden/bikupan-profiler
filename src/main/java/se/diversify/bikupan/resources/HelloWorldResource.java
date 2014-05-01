package se.diversify.bikupan.resources;

import com.google.common.collect.ImmutableMap;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/computer")
@Produces("application/json;charset=UTF-8")
@Api(value = "/computer", description = "This is just a hello world")
public class HelloWorldResource {

    public HelloWorldResource() {
        // Empty by design
    }

    @GET
    @Path("/says")
    @ApiOperation(value = "Listen to Uzi", notes = "What he wants to say", response = String.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Uzi's talking")
    })
    public Response getPlayingRounds() {
        return Response.ok(ImmutableMap.of("message", "Says hello to Uzi")).build();
    }

}
