package se.diversify.bikupan.resources;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.wordnik.swagger.annotations.*;
import org.skife.jdbi.v2.DBI;
import se.diversify.bikupan.api.ProfileSearchResult;
import se.diversify.bikupan.core.Profile;
import se.diversify.bikupan.jdbi.ProfileDao;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/profile")
@Produces("application/json;charset=UTF-8")
@Api(value = "/profile", description = "Contains information about co-workers CV")
public class ProfileResource {

    public final ProfileDao profileDao;

    public ProfileResource() {
        profileDao = null; // TODO
    }


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


    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    public Response getProfile(@PathParam("id") long id) {
        Optional<Profile> profileOptional = profileDao.get(id);

        if(profileOptional.isPresent()) {
            return Response
                    .ok(profileOptional.get().file)
                    .header("Content-Disposition", String.format("attachment; filename=%s", profileOptional.get().nameOfFile))
                    .build();
        }
        return Response.status(404).entity(ImmutableMap.of("id", id)).build();
    }

}
