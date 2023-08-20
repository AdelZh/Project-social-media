import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User {

    private static int next = 0;
    private int instanceId;
    private String username;
    private String email;
    private int password;
    private Profile profile;

    public User(String username, String email, int password, Profile profile) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.profile = profile;
        this.instanceId = next++;
        profile.setInstanceId(instanceId);
    }

    public Profile getProfile() {
        return profile;
    }

    public int getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(int instanceId) {
        this.instanceId = instanceId;
    }


    public void setProfile(Profile profile) {
        this.profile = profile;
    }


    public String searchPost(String description) {
        for (int i = 0; i < getProfile().getPosts().length; i++) {
            if (getProfile().getPosts()[i].getImage().equals(description)) {
                return "Founded" + getProfile().getPosts()[i];
            }
        }
        return null;
    }

    public String deletePostById(int Id) {

        boolean found = false;

        Post[] posts = getProfile().getPosts();
        Post[] newPosts = new Post[posts.length - 1];
        for (int i = 0; i < posts.length; i++) {
            if (posts[i].getInstanceId() != Id && !found) {
                newPosts[i] = posts[i];
            } else {
                found = true;
            }
            if (found && i + 1 < posts.length) {
                newPosts[i] = posts[i + 1];
            }


        }

        return "Post is deleted " + Arrays.toString(newPosts);
    }

    public void deletePost(int Id) {

        Post[] pp = getProfile().getPosts();
        Post[] newPP = new Post[pp.length - 1];
        for (int i = 0; i < pp.length; i++) {
            if (pp[i].getInstanceId() == Id) {
                newPP[i] = pp[i];
            }

        }
        pp=newPP;
        pp = Arrays.copyOf(newPP, newPP.length - 1);
        getProfile().setPosts(null);
        System.out.println(getProfile());

    }





    @Override
    public String toString() {
        return "\nUser{" +
                "instanceId=" + instanceId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password=" + password +
                ", profile=" + profile +
                '}';
    }
}