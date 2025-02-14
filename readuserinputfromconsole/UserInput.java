package org.example.Day03.readuserinputfromconsole;


import java.io.*;

public class UserInput {
    public UserInfo getUserInfo() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());

            System.out.print("Enter your favorite programming language: ");
            String favoriteLanguage = reader.readLine();

            return new UserInfo(name, age, favoriteLanguage);
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
        return null;
    }
}

