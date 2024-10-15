package com.directi.training.dip.exercise;

public class Main {
    public static void main(String[] args) {
        Database myDatabase = new MyDatabase();
        UserService userService = new UserService(myDatabase);

        // Register users
        userService.registerUser  ("Brad Smith", "brad.m@foo.com", "foo");
        userService.registerUser  ("Bill Board", "bill.b@foo.com", "bar");
        userService.registerUser  ("Mike Stand", "mike.s@foo.com", "baz");
        userService.registerUser  ("Anna Curtain", "anna.a@foo.com", "qux");
        userService.registerUser  ("Kathy Smith", "kathy.s@foo.com", "corge");
    }
}