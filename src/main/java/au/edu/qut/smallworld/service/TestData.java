package au.edu.qut.smallworld.service;

import au.edu.qut.smallworld.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by andrew on 25/06/2014.
 */
@Service
public class TestData {

    @Autowired private UserRepository userRepo;
    @Autowired private AuthenticatedUserRepository authUserRepo;
    @Autowired private FollowingRepository followingRepo;
    //@Autowired private TimelineRepository timelineRepo;
    //@Autowired private TweetRepository tweetRepo;

    final Logger logger = LoggerFactory.getLogger(TestData.class);

    public void createTestData() {
        logger.info("Saving User");
        User user = new User("usn", "un", "loc", "desc", "pl", "ipu", "uu", "tz", 10);
        logger.info("The user is: "+user.toString());
        userRepo.save(user);
        logger.info("Done saving User");
    }

}
