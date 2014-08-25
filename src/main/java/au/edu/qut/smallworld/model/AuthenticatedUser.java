package au.edu.qut.smallworld.model;

import javax.persistence.*;

/**
 * Created by andrew on 25/06/2014.
 */
@Entity(name="AuthenticatedUsers")
public class AuthenticatedUser {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Column(nullable = false, unique = true)
    private String userScreenName;
    @Column(nullable = false)
    private String OAuthAccessToken;
    @Column(nullable = false)
    private String OAuthAccessTokenSecret;

    protected AuthenticatedUser() {}

    public AuthenticatedUser(String userScreenName, String OAuthAccessToken, String OAuthAccessTokenSecret) {
        this.userScreenName = userScreenName;
        this.OAuthAccessToken = OAuthAccessToken;
        this.OAuthAccessTokenSecret = OAuthAccessTokenSecret;
    }

    @Override
    public String toString() {
        return "AuthenticatedUser{" +
                "id=" + id +
                ", userScreenName='" + userScreenName + '\'' +
                ", OAuthAccessToken='" + OAuthAccessToken + '\'' +
                ", OAuthAccessTokenSecret='" + OAuthAccessTokenSecret + '\'' +
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

    public String getOAuthAccessToken() {
        return OAuthAccessToken;
    }

    public void setOAuthAccessToken(String OAuthAccessToken) {
        this.OAuthAccessToken = OAuthAccessToken;
    }

    public String getOAuthAccessTokenSecret() {
        return OAuthAccessTokenSecret;
    }

    public void setOAuthAccessTokenSecret(String OAuthAccessTokenSecret) {
        this.OAuthAccessTokenSecret = OAuthAccessTokenSecret;
    }
}


/*
String sqlCreateTblAuthenticatedUsers = "CREATE TABLE IF NOT EXISTS AuthenticatedUsers"
	            + "  (userScreenName     VARCHAR(60) not null,"
	            + "   OAuthAccessToken   VARCHAR(50) not null,"
	            + "   OAuthAccessTokenSecret VARCHAR(45) not null,"
	            + "	  PRIMARY KEY (userScreenName))";
	            */