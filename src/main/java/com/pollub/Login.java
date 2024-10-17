package com.pollub;

import java.util.Objects;
import java.util.Scanner;

public class Login {

    // allowing user passing username and password, next checking if they are correct
    public void login(User user) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username:");
        String username = sc.next();
        System.out.println("Enter password:");
        String password = sc.next();
        if (Objects.equals(username, user.username) && Objects.equals(password, user.password)) {
            System.out.println("You are logged in!");
        }
        else {
            System.out.println("Wrong username or password!");
        }
    }

}
