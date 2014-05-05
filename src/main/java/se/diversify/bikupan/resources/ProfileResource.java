package se.diversify.bikupan.resources;

import com.google.common.collect.ImmutableList;
import com.wordnik.swagger.annotations.*;
import se.diversify.bikupan.api.ProfileSearchResult;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/profile")
@Produces("application/json;charset=UTF-8")
@Api(value = "/profile", description = "Contains information about co-workers CV")
public class ProfileResource {

    @GET
    @Path("/search")
    @ApiOperation(value = "Searching profiles",
            notes = "Searching the profile database given search criteria",
            response = ProfileSearchResult.class,
            responseContainer = "List")
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "No matching the search criteria"),
            @ApiResponse(code = 200, message = "")
    })
    public Response search(
            @ApiParam(value = "Search criteria", required = true)
            @QueryParam("key") String value) {

        if ("Java".equalsIgnoreCase(value)) {
            return Response.ok(ImmutableList.of(
                    new ProfileSearchResult(
                            "Daniel Valfridsson",
                            "CV_daniel_valfridson.doc",
                            "http://localhost:3010/profile/10"))).build();
        }
        return Response.noContent().build();
    }

}
