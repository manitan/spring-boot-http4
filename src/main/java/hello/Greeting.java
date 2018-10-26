package hello;

public class Greeting {

    private final long id;
    private final String content;
    private final Date date; // 追加

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        this.date = new Date(); // 追加
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    // このメソッドを追加
    public Date getDate() {
        return date;
    }
}
