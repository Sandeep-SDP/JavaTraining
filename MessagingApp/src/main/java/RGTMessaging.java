import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RGTMessaging {
    private static final List<Tweet> tweets = new ArrayList<>();
    private static Map<String, User> users;

    public RGTMessaging() {
        users = new HashMap<>();
    }

    public void registerUser(String username, String password, String name, String bio) {
        DataStore data = new DataStore();
        if (!users.containsKey(username)) {
            User newUser = new User(username, password, name, bio);
            users.put(username, newUser);
            data.saveData(List.of(newUser), tweets);
        } else {
            System.out.println("Username already exists. Please choose a different username.");
        }
    }

    public User login(String username, String password) {
        if (users.containsKey(username)) {
            User user = users.get(username);
            if (user.getPassword().equals(password)) {
                System.out.println("Login successful. Welcome, " + user.getName() + "!");
                return user;
            } else {
                System.out.println("Incorrect password. Please try again.");
            }
        } else {
            System.out.println("Username not found. Please check your username or register a new account.");
        }
        return null;
    }

    public void logout(User user) {
        System.out.println("Logged out successfully " + user.getUsername() + "!");
    }

    public User searchUser(String username) {
        for (String usernames : users.keySet()) {
            System.out.println(usernames);
        }
        return users.get(username);
    }

    public List<String> searchTweet(String keyword,User user) {
        List<String> matchingTweetContents = new ArrayList<>();

        List<Tweet> tweets = user.tweets;
        for (Tweet tweet : tweets) {
            if (tweet.getContent().contains(keyword)) {
                matchingTweetContents.add(tweet.getContent());
            }
        }
        return matchingTweetContents;
    }

    public List<Tweet> getTimeline(User user) {
        List<Tweet> timeline = new ArrayList<>();
        for (Tweet tweet : user.getTweets()) {
            if (tweet.getAuthor().equals(user.getName())) {
                timeline.add(tweet);
            }
        }
        return timeline;
    }

    public List<Tweet> getProfile(User user) {
        List<Tweet> tweets = user.getTweets();
        for (Tweet tweet : tweets) {
            System.out.println("Tweet Id: " + tweet.getId());
            System.out.println("Content: " + tweet.getContent());
            System.out.println("Author: " + tweet.getAuthor());
            System.out.println("Timestamp: " + tweet.getTimestamp());
        }
        return tweets;
    }
}
