package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
Create a HandlePerformances class. This class uses the Performance class and creates a queue of its
object called performances. This queue is implemented as a LinkedList.
§ Create a handlePerformances () method. This method simply presents the user with the different
options. 1. Add performances; 2. Display all the performances; 3. Start the performances; 4. QUIT.
o 1. If the user chooses ‘1’, then ask the user how many performances must be added. Then use
that input as a parameter and pass it to a method called addPerformances(). This method
allows the user to enter the performance details like ID, name, and the lead name. Then it
takes all of those values and adds it to the performances queue.
2. If the user chooses ‘2’, then simply call the displayPerformances() method and display all
the values from the queue.
o 3. If the user chooses ’3’, then simply call the startPerformance() method and display only the
first performance that is stored in the queue.
 */
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
