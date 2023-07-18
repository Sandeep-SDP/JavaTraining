import java.util.List;
import java.util.Scanner;

public class RGTMain {
    public User loginUser;

    public static void main(String[] args) {
        RGTMain rGTMain = new RGTMain();
        rGTMain.operations();

    }

    public void operations() {
        String username;
        String password;
        String name;
        String bio;
        RGTMessaging messaging = new RGTMessaging();
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("Welcome to RGT-Messaging!");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    username = scanner.next();
                    System.out.print("Enter Password: ");
                    password = scanner.next();
                    System.out.print("Enter name: ");
                    name = scanner.next();
                    System.out.print("Enter BioDetails: ");
                    bio = scanner.next();
                    messaging.registerUser(username, password, name, bio);
                    break;

                case 2:
                    System.out.print("Enter username: ");
                    username = scanner.next();
                    System.out.print("Enter Password: ");
                    password = scanner.next();
                    loginUser = messaging.login(username, password);
                    if (loginUser == null) {
                        break;
                    }
                    do {
                        System.out.println("1. Post a tweet: ");
                        System.out.println("2. View your timeline: ");
                        System.out.println("3. Search for users: ");
                        System.out.println("4. Search for tweets: ");
                        System.out.println("5. View your profile: ");
                        System.out.println("6. Logout");
                        System.out.print("Enter your choice: ");
                        choice = scanner.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("Type your tweet: ");
                                scanner.nextLine();
                                String tweet = scanner.nextLine();
                                loginUser.postTweet(tweet);
                                break;
                            case 2:
                                List<Tweet> timeline = messaging.getTimeline(loginUser);
                                for (Tweet tweet1 : timeline) {
                                    System.out.println("Content: " + tweet1.getContent());
                                    System.out.println("Timeline: " + tweet1.getTimestamp());
                                }
                                break;
                            case 3:
                                System.out.println("These are the following users: ");
                                messaging.searchUser(loginUser.getUsername());
                                break;
                            case 4:
                                System.out.println("Enter the keyword: ");
                                String keyword = scanner.next();
                                List<String> matchingTweetContents = messaging.searchTweet(keyword,loginUser);
                                if (matchingTweetContents.isEmpty()) {
                                    System.out.println("No matching tweets found.");
                                } else {
                                    for (String tweetContent : matchingTweetContents) {
                                        System.out.println("Available content: " + tweetContent);
                                    }
                                }
                                break;
                            case 5:
                                System.out.println("Your profile and Tweets: ");
                                messaging.getProfile(loginUser);
                                break;
                            case 6:
                                messaging.logout(loginUser);
                                break;
                            default:
                                System.out.println("Invalid option. Please try again.");
                                break;
                        }
                    } while (choice != 6);
                    break;
                case 3:
                    System.out.println("Exiting the Application.");
                    System.out.println("Thank You!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}