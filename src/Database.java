import java.util.Arrays;

public class Database {

    private Profile[] profiles;
    private User[] user;


    public Database(Profile[] profiles, User[] users) {
        this.profiles = profiles;
        this.user = users;
    }




    public User [] saveUser(User users) {
        for (User pp : user) {
            if (!pp.equals(users)) {
                User[] ppp = new User[user.length + 1];
                for (int i = 0; i < user.length; i++) {
                    ppp[i] = user[i];
                }
                ppp[user.length] = users;
                user = Arrays.copyOf(ppp, ppp.length);
               return user;

            }
        }
        return user;
    }


    public void findProfileByUserId(int userId) {
        for (int i = 0; i < user.length; i++) {
            if (user[i].getInstanceId() == userId) {
                System.out.println(profiles[i]);
            }
        }
    }
    public String deleteProfileByUserId(int userId){
        for(int i=0; i<user.length; i++){
            if(user[i].getInstanceId()==userId){
                user[i].setProfile(null);
                return "Deleted"+user[i];
            }
        }
        return null;
    }


    public User[] findUserById(int id) {
        for (int i = 0; i < user.length; i++) {
            if (user[i].getInstanceId() == id) {
                System.out.println(user[i]);
            }
        }
        return user;
    }


    public Comment saveComment2222(int postId, int userId, Comment comment) {
        for (int i = 0; i < profiles.length; i++) {
            if (profiles[i].getInstanceId() == userId) {
                for (Post p : profiles[i].getPosts()) {
                    if (p.getInstanceId() == postId) {
                        Comment[] oldComments = p.getComments();
                        Comment[] newComments = new Comment[oldComments.length + 1];

                        for (int j = 0; j < oldComments.length; j++) {
                            newComments[j] = oldComments[j];
                        }

                        newComments[oldComments.length] = comment;
                        p.setComments(newComments);

                        System.out.println(profiles[i]);
                        return comment;
                    }
                }
            }
        }

        return comment;
    }


    public User[] deleteUser2(int userId) {
        int indexToRemove = -1;
        for (int i = 0; i < user.length; i++) {

            if (user[i].getInstanceId() == userId) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            User[] arr = new User[user.length + 1];
            int j = 0;
            for (int i = 0; i < user.length; i++) {
                if (i != indexToRemove) {
                    arr[i] = user[i];
                   j++;
                   // System.out.println(user[i]);
                }
            }
            user = arr;
            user = Arrays.copyOf(arr, arr.length - 1);
        }
        return user;

    }



    public String saveProfileByUserId(int userId, Profile profile) {
        for (User user : user) {
            if (user.getInstanceId() == userId) {
                user.setProfile(profile);
                System.out.println(user);
                System.out.println(profile);
                break;
            }

            if(user.getInstanceId()!=userId){
                System.out.println("We can not find user by this ID");
            }
        }
        return "Added";

    }

    public void updateUserProfile(int userId, Profile profile) {
        for (int i = 0; i < profiles.length; i++) {
            if (profiles[i].getInstanceId() == userId) {
                System.out.println("Founded: " + profiles[i].getInstanceId());
                profiles[i].setGender("Man");
                System.out.println(profiles[i]);
            }
        }

    }




    public String savePost(int userId, Post post) {
        for (Profile myProfiles : profiles) {
            if (myProfiles.getInstanceId() == userId) {
                Post[]  myOldPosts = myProfiles.getPosts();
                Post[] newPosts = new Post[myOldPosts.length + 1];

                for (int i = 0; i < myOldPosts.length; i++) {
                    newPosts[i] = myOldPosts[i];
                }

                newPosts[myOldPosts.length] = post;
                myProfiles.setPosts(newPosts);
                System.out.println(myProfiles);
                System.out.println(post);
            }
        }
        return "Added";
    }


    public void getPostByUserId(int userId) {
        for(Profile po:profiles){
            if(po.getInstanceId()==userId){
                Post [] old=po.getPosts();
                for(int i=0; i<old.length; i++){
                    System.out.println(old[i]);
                }
            }
        }

    }


    @Override
    public String toString() {
        return "Database{" +
                "profiles=" + Arrays.toString(profiles) +
                ", user=" + Arrays.toString(user) +

                '}';
    }
}











