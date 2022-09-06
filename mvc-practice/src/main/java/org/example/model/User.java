package org.example.model;

public class User {
    private String userId;
    private String name;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public boolean equalsUser(User user) {
        return this.equals(user);
    }
}
