package au.edu.qut.smallworld.controller;

import au.edu.qut.smallworld.model.Followers;
import au.edu.qut.smallworld.model.User;
import au.edu.qut.smallworld.model.UserRepository;
import au.edu.qut.smallworld.service.TestData;
import au.edu.qut.smallworld.service.TwitterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by andrew on 25/06/2014.
 */

@RestController
public class HomeController {

    @Autowired private TestData test;
    @Autowired private UserRepository userRepo;
    @Autowired private TwitterService twitter;

    final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/users")
    public Iterable<User> getAllUsers() {
        logger.info("Find all users");
        return userRepo.findAll();
    }

    @RequestMapping("/createUser")
    public String createUser() {
        logger.info("Creating Test User");
        test.createTestData();
        return "Done";
    }

    @RequestMapping("/timeline/{twitterUser}")
    public List<Tweet> getUserTimeline(@PathVariable String twitterUser) {
        return twitter.getUserTimeline(twitterUser);
    }

    @RequestMapping("/followers/{twitterUser}")
    public List<String> getFollowers(@PathVariable String twitterUser) {
        return twitter.getFollowers(twitterUser);
    }

    @RequestMapping("/followersOffollowers/{twitterUser}")
    public List<Followers> getFollowersOfFollowers(@PathVariable String twitterUser) {
        return twitter.getFollowersOfFollowers(twitterUser);
    }



    @RequestMapping("/process/{twitterUser}")
    public String process(@PathVariable String twitterUser) {

        //Get Home Timeline of User (Paged)
        List<Tweet> userTweets = twitter.getUserTimeline(twitterUser);

        //Get Followers IDs
        //twitter.friendOperations

        //For each id:

            //get ID and Name
            //get Followers & print names

            //get timeLine
            //for each timeline status:

                //get the text
                //break into words

                //Add tweets to instances list for LDA


        //Process tweets

        /*

        Twitter twitter = new TwitterFactory().getInstance();

//insert the appropriate consumer key and consumer secret here

      twitter.setOAuthConsumer("rhH1OvRtbUOIrCGgQAo1g",
          "hC4UFXEHbjI3ep8pRLv0IFeGCbWixRU5NYfUH2bMwc");
      RequestToken requestToken = twitter.getOAuthRequestToken();
      AccessToken accessToken = null;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      while (null == accessToken) {
        System.out.println("Open the following URL and grant access to your account:");
        System.out.println(requestToken.getAuthorizationURL());
        System.out.print("Enter the PIN(if aviailable) or just hit enter.[PIN]:");
        String pin = br.readLine();
        try{


           if(pin.length() > 0){
             accessToken = twitter.getOAuthAccessToken(requestToken, pin);
           }else{
             accessToken = twitter.getOAuthAccessToken();
           }
        } catch (TwitterException te) {
          if(401 == te.getStatusCode()){
            System.out.println("Unable to get the access token.");
          }else{
            te.printStackTrace();
          }
        }
      }
      //persist to the accessToken for future reference.
      System.out.println(twitter.verifyCredentials().getId());
      System.out.println("token : " + accessToken.getToken());
      System.out.println("tokenSecret : " + accessToken.getTokenSecret());
      //storeAccessToken(twitter.verifyCredentials().getId() , accessToken);
      //Status status = twitter.updateStatus(args[0]);
      //System.out.println("Successfully updated the status to [" + status.getText() + "].");

         */

        return "Finished";
    }
}
