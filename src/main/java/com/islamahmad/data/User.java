package com.islamahmad.data;
import java.util.ArrayList;
import java.util.List;
public class User {
    private String username;
    private String password;
    public List<Privilege> getPrivileges() { return privileges; }
    private List<Privilege> privileges = new ArrayList<>();
    public User(String username, String password) { this.username = username; this.password = password; }
    public void addPrivilege(Privilege privilege) { this.privileges.add(privilege); }
    String getUsername() { return username; }
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", privileges=" + privileges +
                '}';
    }

    public String getPassword() { return password; }
}
