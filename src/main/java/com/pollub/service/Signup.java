package com.pollub.service;

import com.pollub.model.User;

import java.util.Scanner;

public class Signup {

    public User newUser() {
        System.out.println("Signup newUser");
        System.out.println("\nPodaj nazwę użytkownika:");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        System.out.println("Podaj hasło:");
        String password = sc.nextLine();
        sc.close();
        return new User(username, password);
    }
}
