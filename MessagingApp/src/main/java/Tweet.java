import java.util.Date;

public class Tweet {
    private static int nextId = 1;
    private int id;
    private String content;
    private String author;

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Tweet.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    private Date timestamp;

    public Tweet(String content, String author) {
        this.id = nextId++;
        this.content = content;
        this.author = author;
        this.timestamp=new Date();
    }
}