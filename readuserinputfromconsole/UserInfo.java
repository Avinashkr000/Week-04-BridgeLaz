package org.example.Day03.readuserinputfromconsole;


import java.io.Serializable;

public class UserInfo implements Serializable {
    private String name;
    private int age;
    private String favoriteLanguage;

    public UserInfo(String name, int age, String favoriteLanguage) {
        this.name = name;
        this.age = age;
        this.favoriteLanguage = favoriteLanguage;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nFavorite Programming Language: " + favoriteLanguage;
    }
}

