package com.directi.training.dip.exercise;

public class UserService {
    private Database database;

    public UserService(Database database) {
        this.database = database;
    }

    public void registerUser  (String userName, String email, String password) {
        String userData = String.format("User  Name:%s,Email:%s,Password:%s", userName, email, password);
        database.write(userData);
    }
}