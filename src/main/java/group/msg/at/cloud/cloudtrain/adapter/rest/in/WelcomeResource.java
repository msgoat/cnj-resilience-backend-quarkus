package group.msg.at.cloud.cloudtrain.adapter.rest.in;

import group.msg.at.cloud.cloudtrain.core.boundary.Welcome;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST endpoint returning welcome messages.
 * <p>
 * Handles only the mapping of a REST invocation to a Java method invocation;
 * all transactional business logic is encapsulated in a {@code Boundary} this resource class delegates to.
 * </p>
 * <p>
 * Please note that JAX-RS {@code Resource} classes must be {@code @RequestScoped} according to the JAX-RS 2.1 spec in
 * order for JAX-RS to work properly with CDI.
 * </p>
 */
@RequestScoped
@Path("v1/welcome")
public class WelcomeResource {

    @Inject
    Welcome boundary;

    @GET
    @Path("{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getWelcomeItems(@PathParam("userId") String userId) {
        return Response.ok(boundary.collectWelcomeItems(userId)).build();
    }

    @GET
    @Path("resilient/{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getWelcomeItemsWithResilience(@PathParam("userId") String userId) {
        return Response.ok(boundary.collectWelcomeItemsWithResilience(userId)).build();
    }
}
