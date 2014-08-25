package au.edu.qut.smallworld.model;

import org.springframework.social.twitter.api.TwitterProfile;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrew on 27/06/2014.
 */
public class Followers {
    private TwitterProfile user;
    private List<TwitterProfile> followers = new ArrayList<>();

    public Followers() {}

    public Followers(TwitterProfile user) {
        this.user = user;
    }

    public void addFollower(TwitterProfile follower) {
        this.followers.add(follower);
    }

    public TwitterProfile getUser() {
        return user;
    }

    public void setUser(TwitterProfile user) {
        this.user = user;
    }

    public List<TwitterProfile> getFollowers() {
        return followers;
    }

    public void setFollowers(List<TwitterProfile> followers) {
        this.followers = followers;
    }
}
