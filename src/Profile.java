import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Profile {


    private int instanceId;
    private String fullName;
    private LocalDate dateOfBirth;
    private String gender;

    private Post[] posts;

    public Profile(String fullName, LocalDate dateOfBirth, String gender, Post[] posts) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.posts = posts;

    }
    public int getInstanceId() {
        return instanceId;
    }public void setGender(String gender) {
        this.gender = gender;
    }
    public Post[] getPosts() {
        return posts;
    }public void setPosts(Post[] posts) {
        this.posts = posts;}
    public void setInstanceId(int instanceId) {
        this.instanceId = instanceId;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "instanceId=" + instanceId +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", posts=" + Arrays.toString(posts) +
                '}';
    }}