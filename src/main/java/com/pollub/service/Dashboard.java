package com.pollub.service;

import java.util.Scanner;

public class Dashboard {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Wybierz opcję:");
            System.out.println("1 - Logowanie");
            System.out.println("2 - Rejestracja");
            System.out.println("0 - Wyjście");

            System.out.print("Twój wybór: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Proszę wprowadzić poprawną liczbę.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Wybrałeś logowanie.");
                    break;
                case 2:
                    System.out.println("Wybrałeś rejestrację.");
                    break;
                case 0:
                    System.out.println("Zamykam program. Do widzenia!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Niepoprawny wybór. Spróbuj ponownie.");
            }
        }
    }
}
