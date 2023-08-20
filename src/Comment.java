import java.time.LocalDate;

public class Comment {
    private static int next= 3;
    private int instanceId;
    private String text;
    private LocalDate commentDate;

    public Comment(String text, LocalDate commentDate) {
        this.text = text;
        this.commentDate = commentDate;
        this.instanceId=next++;
    }
    public int getInstanceId() {
        return instanceId;
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Override
    public String toString() {
        return "Comment{" +
                "instanceId=" + instanceId +
                ", text='" + text + '\'' +
                ", commentDate=" + commentDate +
                '}';
    }}
