import java.time.LocalDate;
import java.util.Arrays;
import java.util.concurrent.Callable;

public class Post {

    private static int next = 2;
    private int instanceId;
    private String image;
    private String description;
    private LocalDate created;
    Comment[] comments;
    public Post(String image, String description, LocalDate created, Comment[] comments) {
        this.image = image;
        this.description = description;
        this.created = created;
        this.comments = comments;
        this.instanceId = next++;
    }

    public int getInstanceId() {
        return instanceId;}public String getImage() {
        return image;}public Comment[] getComments() {
        return comments;
    }public void setComments(Comment[] comments) {
        this.comments = comments;
    }

    public void findCommentByPostId(int postId) {
        for (int i = 0; i < comments.length; i++) {
            if (comments[i].getInstanceId() == postId) {
                System.out.println(comments[i]);
            }
        }
    }

    public void updateComment(int commentId, String newText) {
        for (Comment cc : comments) {
            if (cc.getInstanceId() == commentId) {
                cc.setText(newText);
                System.out.println(cc);
            }
        }

    }

    public void deleteComment(Comment comment) {
        int indexToRemove = -1;
        for (int i = 0; i < comments.length; i++) {

            if (comments[i].getText().equals(comment.getText())) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            Comment[] arr = new Comment[comments.length + 1];
            int j = 0;
            for (int i = 0; i < comments.length; i++) {
                if (i != indexToRemove) {
                    arr[j] = comments[i];
                    j++;
                    System.out.println(comments[i]);
                }
            }
            comments = arr;
            comments = Arrays.copyOf(arr, arr.length - 1);
        }

    }


    @Override
    public String toString() {
        return "Post{" +
                "instanceId=" + instanceId +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                ", created=" + created +
                ", comments=" + Arrays.toString(comments) +
                '}';
    }}
