package au.edu.qut.smallworld.model;

import javax.persistence.*;

/**
 * Created by andrew on 25/06/2014.
 */

@Entity(name="Users")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Column(name="userScreenName", nullable = false, unique = true)
    private String userScreenName;

    private String username;
    private String location;
    private String description;
    private String prefLanguage;
    private String imageProfileURL;
    private String userURL;
    private String timeZone;
    private Integer approxNumTweets;

    protected User() {}

    public User( String userScreenName, String username, String location, String description, String prefLanguage, String imageProfileURL, String userURL, String timeZone, Integer approxNumTweets) {
        this.userScreenName = userScreenName;
        this.username = username;
        this.location = location;
        this.description = description;
        this.prefLanguage = prefLanguage;
        this.imageProfileURL = imageProfileURL;
        this.userURL = userURL;
        this.timeZone = timeZone;
        this.approxNumTweets = approxNumTweets;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userScreenName='" + userScreenName + '\'' +
                ", username='" + username + '\'' +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                ", prefLanguage='" + prefLanguage + '\'' +
                ", imageProfileURL='" + imageProfileURL + '\'' +
                ", userURL='" + userURL + '\'' +
                ", timeZone='" + timeZone + '\'' +
                ", approxNumTweets=" + approxNumTweets +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserScreenName() {
        return userScreenName;
    }

    public void setUserScreenName(String userScreenName) {
        this.userScreenName = userScreenName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrefLanguage() {
        return prefLanguage;
    }

    public void setPrefLanguage(String prefLanguage) {
        this.prefLanguage = prefLanguage;
    }

    public String getImageProfileURL() {
        return imageProfileURL;
    }

    public void setImageProfileURL(String imageProfileURL) {
        this.imageProfileURL = imageProfileURL;
    }

    public String getUserURL() {
        return userURL;
    }

    public void setUserURL(String userURL) {
        this.userURL = userURL;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Integer getApproxNumTweets() {
        return approxNumTweets;
    }

    public void setApproxNumTweets(Integer approxNumTweets) {
        this.approxNumTweets = approxNumTweets;
    }
}

/*

String sqlCreateTblUsers = "CREATE TABLE IF NOT EXISTS Users"
	            + "  (userScreenName     VARCHAR(60) not null,"
	            + "   username   VARCHAR(60),"
	            + "   location VARCHAR(45),"
	            + "   description VARCHAR(160),"
	            + "   id REAL,"					//a REAL in Mysql converts to a long in Java
	            + "   prefLanguage VARCHAR(60),"
	            + "   imageProfileURL VARCHAR(160),"
	            + "   userURL VARCHAR(160),"
	            + "   timeZone VARCHAR(100),"	//time zone could be useful for determining location information
	            + "   approxNumTweets INTEGER,"	//this is an approximate number of tweets: approximate because we don't want to update it every time
	            + "	  PRIMARY KEY (userScreenName))";

 */