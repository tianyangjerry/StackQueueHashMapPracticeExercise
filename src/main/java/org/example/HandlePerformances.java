package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HandlePerformances {
    Queue<Performance> performances = new LinkedList<>();

    public void handlePerformances() {
        System.out.println("What do you want to do?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add performances");
        System.out.println("2. Display all the performances");
        System.out.println("3. Start the performances");
        System.out.println("4. QUIT");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("How many performances must be added?");
                int performances = scanner.nextInt();
                addPerformances(performances);
                break;
            case 2:
                displayPerformances();
                break;
            case 3:
                startPerformance();
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    public void addPerformances(int performances) {
        System.out.println("Enter the performance details like ID, name, and the lead name.");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < performances; i++) {
            System.out.println("What is the performance ID?");
            String performanceID = scanner.nextLine();
            System.out.println("What is the performance name?");
            String performanceName = scanner.nextLine();
            System.out.println("What is the lead name?");
            String leadName = scanner.nextLine();
            Performance performance = new Performance(performanceID, performanceName, leadName);
            this.performances.add(performance);
        }

    }

    public void displayPerformances() {
        for (Performance performance : performances) {
            System.out.println(performance);
        }
    }

    public void startPerformance() {
        System.out.println(performances.peek());
    }
}
