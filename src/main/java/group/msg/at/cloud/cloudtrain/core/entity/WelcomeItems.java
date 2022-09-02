package group.msg.at.cloud.cloudtrain.core.entity;

import java.util.ArrayList;
import java.util.List;

public class WelcomeItems {

    private List<String> statusMessages = new ArrayList<>();

    private List<RecommendedItem> recommendations = new ArrayList<>();

    private List<WatchedItem> watchList = new ArrayList<>();

    public void addStatusMessage(String message) {
        this.statusMessages.add(message);
    }

    public Iterable<String> getStatusMessages() {
        return this.statusMessages;
    }

    public void setRecommendations(List<RecommendedItem> recommendations) {
        this.recommendations = recommendations;
    }

    public List<RecommendedItem> getRecommendations() {
        return recommendations;
    }

    public void setWatchList(List<WatchedItem> watchList) {
        this.watchList = watchList;
    }

    public List<WatchedItem> getWatchList() {
        return watchList;
    }
}
