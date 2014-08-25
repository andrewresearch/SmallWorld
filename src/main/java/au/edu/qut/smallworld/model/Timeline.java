package au.edu.qut.smallworld.model;
/*
import org.springframework.social.twitter.api.Tweet;

import javax.persistence.*;


@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"userId","tweetId"}))
public class Timeline {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @ManyToOne(optional = false)
    @JoinColumn(name= "userId", referencedColumnName = "id")
    private User user;

    @ManyToOne(optional = false)
    @JoinColumn(name= "tweetId", referencedColumnName = "id")
    private Tweet tweet;



    protected Timeline() {}

    public Timeline(User user, Tweet tweet) {
        this.user = user;
        this.tweet = tweet;
    }

    @Override
    public String toString() {
        return "Timeline{" +
                "id=" + id +
                ", user=" + user +
                ", tweet=" + tweet +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Tweet getTweet() {
        return tweet;
    }

    public void setTweet(Tweet tweet) {
        this.tweet = tweet;
    }
}
*/