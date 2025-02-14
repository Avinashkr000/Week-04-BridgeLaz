package org.example.Day03.readuserinputfromconsole;


public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        UserInfo userInfo = userInput.getUserInfo();

        if (userInfo != null) {
            FileHandler fileHandler = new FileHandler();
            fileHandler.saveToFile(userInfo, "E:\\cppp\\userInfo.txt");
        }
    }
}
