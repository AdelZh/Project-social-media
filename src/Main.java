import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.Callable;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Comment comment = new Comment("My comment", LocalDate.of(2023, 11, 23));
        Comment comment1 = new Comment("Your comment", LocalDate.of(2023, 5, 13));
        Comment comment2 = new Comment("My comment2", LocalDate.of(2023, 11, 23));
        Comment comment3 = new Comment("Your comment3", LocalDate.of(2023, 5, 13));
        Comment comment4 = new Comment("You and me", LocalDate.of(2022, 10, 2));
        Comment[] comments1 = {comment, comment1, comment2,comment3};


        Post post = new Post("Photo", "Swimming", LocalDate.of(2023, 11, 3), comments1);
        Post post1 = new Post("PhotoShoot", "Nature", LocalDate.of(2023, 11, 6), comments1);
        Post post2 = new Post("Photo2", "Swimming", LocalDate.of(2023, 11, 3), comments1);
        Post post3 = new Post("PhotoShoot3", "Nature", LocalDate.of(2023, 11, 6), comments1);
        Post post4=new Post("Alibek", "Learning", LocalDate.of(2022, 12, 3), comments1);
        Post[] p = {post, post2, post3};



        Profile profile = new Profile("Alina", LocalDate.of(2000, 1, 20), "Female", p);
        Profile profile1 = new Profile("E", LocalDate.of(2000, 10, 21), "Female", p);

        Profile profile2 = new Profile("A", LocalDate.of(2000, 1, 20), "Female", p);
        Profile profile3 = new Profile("Elina", LocalDate.of(2000, 10, 21), "Female", p);
        Profile[] profiles = {profile, profile1, profile2};


        User user1 = new User("AdelZh", "@adel", 123, profile);
        User anotherUser = new User("AnotherUser", "another@example.com", 45, profile1);
        User anotherUser2 = new User("Ana", "@ana", 78, profile2);
        User anotherUser3=new User("Kz", "@ellacross", 88, profile3);
        User[] users = {user1, anotherUser,anotherUser3};


        Database database1 = new Database(profiles, users);

        Scanner scanner = new Scanner(System.in);


        System.out.println("This is the ID of users");

        System.out.println(user1.getInstanceId());
        System.out.println(anotherUser.getInstanceId());
        System.out.println(anotherUser2.getInstanceId());
        System.out.println(anotherUser3.getInstanceId());
        System.out.println("-----------------------------");
        System.out.println("This is the ID of profiles");
        System.out.println(profile.getInstanceId());
        System.out.println(profile1.getInstanceId());
        System.out.println(profile2.getInstanceId());
        System.out.println(profile3.getInstanceId());
        System.out.println("This is the ID of comments");
        System.out.println(comment.getInstanceId());
        System.out.println(comment1.getInstanceId());
        System.out.println(comment2.getInstanceId());
        System.out.println(comment3.getInstanceId());
        System.out.println(comment4.getInstanceId());
        System.out.println("This is the ID of posts");
        System.out.println(post.getInstanceId());
        System.out.println(post1.getInstanceId());
        System.out.println(post2.getInstanceId());
        System.out.println(post3.getInstanceId());
        System.out.println(post4.getInstanceId());



        System.out.println("1. Save");
        System.out.println("2. Find");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        System.out.println("5. SearchPost");
        System.out.println("6. exit");

        while (true) {
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    if(choose==1){
                        database1.saveProfileByUserId(1, profile3);
                        System.out.println("-------------------------------");
                        System.out.println(Arrays.toString(database1.saveUser(anotherUser2)));
                        System.out.println("-------------------------------");
                        System.out.println(database1.savePost(0, post4));
                        System.out.println("-------------------------------");
                        System.out.println(database1.saveComment2222(2, 1, comment4));
                        break;
                    }
                    case 2:
                    if(choose ==2){
                        database1.getPostByUserId(1);
                        System.out.println("----------------------------------");
                        database1.findUserById(0);
                        database1.findProfileByUserId(0);
                        post3.findCommentByPostId(5);
                        break;
                    }
                    case 3:
                    if(choose==3){
                        post2.updateComment(5, "Peaksoft");
                        database1.updateUserProfile(1, profile2);
                    }
                    break;
                case 4:
                    if(choose==4){

                        System.out.println(database1.deleteProfileByUserId(3));
                        System.out.println("-----------------------------------");
                        post2.deleteComment(comment1);
                        System.out.println("------------------------------------");
                        System.out.println(Arrays.toString(database1.deleteUser2(3)));
                        System.out.println("------------------------------------");
                        System.out.println((anotherUser.deletePostById(2)));
                        System.out.println("I deleted post by id 2:" +post);
                        anotherUser.deletePost(3);
                        break;
                    }
                case 5:
                    if(choose==5){
                        System.out.println(user1.searchPost("PhotoShoot"));
                    }
                    break;
                case 6:
                    System.exit(0);








    }
}}}