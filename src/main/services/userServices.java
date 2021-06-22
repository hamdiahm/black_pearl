package main.services;

import main.dao.UserDOA;
import main.entities.User;

public class userServices {
    public static void main(String[] args) {
    UserDOA userDOA = new UserDOA();
    // to test add user functionality
    //    User user = new User("Ahmed", "ahmed@gmail.com", "livreur");
    //    User user = new User(-1,"ahmed", "ahmed@mail.com", "+21626953197", "", "https://previews.123rf.com/images/triken/triken1608/triken160800028/61320729-male-avatar-profile-picture-default-user-avatar-guest-avatar-simply-human-head-vector-illustration-i.jpg","04999999", null, "Livreur", "4222");
    //    userDOA.add_user(user);
    // to test update user functionality
    //    userDOA.update_user(user,1);
    // to test get list of users functionality
    //  System.out.println(userDOA.get_users());
    // to test delete user functionality
      userDOA.delete_user(0);
    }
}
