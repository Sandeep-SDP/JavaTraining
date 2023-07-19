import java.io.*;
import java.util.List;

public class DataStore {
    private static final String USER_FILE_PATH = "users.txt";
    private static final String TWEET_FILE_PATH = "tweets.txt";

    public void saveData(List<User> users, List<Tweet> tweets) {
        try {
            FileOutputStream userFileOut = new FileOutputStream(USER_FILE_PATH);
            ObjectOutputStream userObjOut = new ObjectOutputStream(userFileOut);
            userObjOut.writeObject(users);
            userObjOut.close();
            userFileOut.close();

            FileOutputStream tweetFileOut = new FileOutputStream(TWEET_FILE_PATH);
            ObjectOutputStream tweetObjOut = new ObjectOutputStream(tweetFileOut);
            tweetObjOut.writeObject(tweets);
            tweetObjOut.close();
            tweetFileOut.close();

            System.out.println("Data saved and Registered successfully.");
        } catch (IOException e) {
            System.out.println("Failed to save data: " + e.getMessage());
        }
    }

    public void loadData(List<User> users, List<Tweet> tweets) {
        try {
            FileInputStream userFileIn = new FileInputStream(USER_FILE_PATH);
            ObjectInputStream userObjIn = new ObjectInputStream(userFileIn);
            List<User> loadedUsers = (List<User>) userObjIn.readObject();
            users.clear();
            users.addAll(loadedUsers);
            userObjIn.close();
            userFileIn.close();

            FileInputStream tweetFileIn = new FileInputStream(TWEET_FILE_PATH);
            ObjectInputStream tweetObjIn = new ObjectInputStream(tweetFileIn);
            List<Tweet> loadedTweets = (List<Tweet>) tweetObjIn.readObject();
            tweets.clear();
            tweets.addAll(loadedTweets);
            tweetObjIn.close();
            tweetFileIn.close();

            System.out.println("Data loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Failed to load data: " + e.getMessage());
        }
    }
}
