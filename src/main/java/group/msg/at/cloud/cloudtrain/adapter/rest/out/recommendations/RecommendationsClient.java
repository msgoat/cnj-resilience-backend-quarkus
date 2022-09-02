package group.msg.at.cloud.cloudtrain.adapter.rest.out.recommendations;

import group.msg.at.cloud.cloudtrain.core.entity.RecommendedItem;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RegisterRestClient(configKey = "cloudtrain.services.recommendations")
@Path("api/v1/recommendations")
public interface RecommendationsClient {

    @GET
    @Path("{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    List<RecommendedItem> getRecommendations(@PathParam("userId") String userId);
}
