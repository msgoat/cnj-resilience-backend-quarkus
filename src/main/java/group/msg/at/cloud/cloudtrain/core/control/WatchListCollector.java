package group.msg.at.cloud.cloudtrain.core.control;

import group.msg.at.cloud.cloudtrain.adapter.rest.out.watchlist.WatchListClient;
import group.msg.at.cloud.cloudtrain.core.entity.WatchedItem;
import group.msg.at.cloud.cloudtrain.core.entity.WelcomeItems;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;

@Dependent
public class WatchListCollector {

    @Inject
    @RestClient
    WatchListClient client;

    public void collect(WelcomeItems target, String userId) {
        List<WatchedItem> watchList = client.getWatchedItems(userId);
        target.setWatchList(watchList);
    }
}
