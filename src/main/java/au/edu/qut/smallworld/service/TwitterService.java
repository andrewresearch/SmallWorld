package au.edu.qut.smallworld.service;

import au.edu.qut.smallworld.model.Followers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrew on 27/06/2014.
 */
@Service
public class TwitterService {

    @Autowired
    Twitter twitter;

    public List<String> getFollowers(String twitterUser) {
        List<String> followers = new ArrayList<>();
        List<TwitterProfile> profiles = twitter.friendOperations().getFollowers(twitterUser);
        for(TwitterProfile profile: profiles) {
            followers.add(profile.getScreenName());
        }
        return followers;
    }

    public List<Followers> getFollowersOfFollowers(String twitterUser) {
        List<Followers> fof = new ArrayList<>();
        List<TwitterProfile> profiles = twitter.friendOperations().getFollowers(twitterUser);
        for(TwitterProfile profile: profiles) {
            Followers f = new Followers(profile);
            for(TwitterProfile follower: twitter.friendOperations().getFollowers(profile.getId())) {
                f.addFollower(follower);
            }
            fof.add(f);
        }
        return fof;
    }

    public List<Tweet> getUserTimeline(String twitterUser) {
        TimelineOperations timelineOps = twitter.timelineOperations();
        List tweets = timelineOps.getUserTimeline("@" + twitterUser);
        return tweets;
    }

    public TwitterProfile getUserProfile(String twitterUser) {
        UserOperations userOperations = twitter.userOperations();
        TwitterProfile userProfile = userOperations.getUserProfile(twitterUser);
        return userProfile;
    }

}
