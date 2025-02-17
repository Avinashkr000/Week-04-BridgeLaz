package org.example.Day06.annotations.intermediatelevel.fieldvalidation;

public class Main {
    public static void main(String[] args) {
        try {
            User user = new User("shortName");
            System.out.println("Username: " + user.getUsername());

            User invalidUser = new User("thisUsernameIsTooLong");  // Will throw exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}