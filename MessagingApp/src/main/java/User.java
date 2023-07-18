import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
    public  List<Tweet> tweets= new ArrayList<>();

    private static List<User> followings;
    private static List<User> followers;
    private String username;
    private String password;
    private String name;
    private String bio;

    //user constructor
    public User(String username, String password, String name, String bio) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.bio = bio;
    }

    public User() {

    }

    public void follow(User user) {
        if (!followings.contains(user)) {
            followings.add(user);
            user.followers.add(this);
        }
    }

    public void unfollow(User user) {
        if (followings.contains(user)) {
            followings.remove(user);
            user.followers.remove(this);
        }
    }

    public void postTweet(String content) {
        Tweet tweet = new Tweet(content, User.this.getName());
        System.out.println(tweet.getContent() + " Tweet added successfully.");
        tweets.add(tweet);
    }

    public void deleteTweet(Tweet tweet) {
        tweets.remove(tweet);
    }

    //Getters and Setters for User class
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<User> getFollowings() {
        return followings;
    }

    public void getFollowers() {
        for (User user : followers) {
            System.out.println("Followers: " + user.getName());
        }
    }

    public List<Tweet> getTweets() {
        return tweets;
    }
}
