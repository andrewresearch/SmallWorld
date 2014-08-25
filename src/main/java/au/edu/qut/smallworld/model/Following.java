package au.edu.qut.smallworld.model;

import javax.persistence.*;

/**
 * Created by andrew on 25/06/2014.
 */
@Entity(name = "Following")
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"sourceId","followedId"}))
public class Following {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @ManyToOne(optional = false)
    @JoinColumn(name= "sourceId", referencedColumnName = "id")
    private User sourceUser;


    @ManyToOne(optional = false)
    @JoinColumn(name= "followedId", referencedColumnName = "id")
    private User followedUser;

    private Boolean followEachOther;


    protected Following() {}

    public Following(User sourceUser, User followedUser, Boolean followEachOther) {
        this.sourceUser = sourceUser;
        this.followedUser = followedUser;
        this.followEachOther = followEachOther;
    }

    @Override
    public String toString() {
        return "Following{" +
                "id=" + id +
                ", sourceUser=" + sourceUser +
                ", followedUser=" + followedUser +
                ", followEachOther=" + followEachOther +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getSourceUser() {
        return sourceUser;
    }

    public void setSourceUser(User sourceUser) {
        this.sourceUser = sourceUser;
    }

    public User getFollowedUser() {
        return followedUser;
    }

    public void setFollowedUser(User followedUser) {
        this.followedUser = followedUser;
    }

    public Boolean getFollowEachOther() {
        return followEachOther;
    }

    public void setFollowEachOther(Boolean followEachOther) {
        this.followEachOther = followEachOther;
    }
}