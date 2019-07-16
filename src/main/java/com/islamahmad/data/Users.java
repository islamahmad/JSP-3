package com.islamahmad.data;
import java.util.HashMap;

public class Users {
    private static HashMap<String, User> users = null;

    private Users() {
        loadUsers();
    }
    public static HashMap<String, User> getUsers() {
        if (users !=null) {return users; }
        else {loadUsers(); return users;}
    }
    private static void loadUsers() {
        users = new HashMap<>();
        User user1= new User("me@islam","admin");
        User user2= new User("me2@islam","view");
        user2.addPrivilege(Privilege.VIEW);
        user1.addPrivilege(Privilege.CREATE_PACKAGE);
        user1.addPrivilege(Privilege.CREATE_USER);
        user1.addPrivilege(Privilege.CREATE_TARIFF_PLAN);
        user1.addPrivilege(Privilege.CREATE_TARIFF);
        users.put(user1.getUsername(),user1);
        users.put(user2.getUsername(),user2);
    }

}
