package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Event event = new Event();
        System.out.println("What do you want to do?");
        System.out.println("1. Organize an event");
        System.out.println("2. Handle complementary passes");
        System.out.println("3. Handle performances");
        System.out.println("4. Get seat details");
        System.out.println("5. QUIT");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                event.organizeEvent();
                break;
            case 2:
                HandleComplementaryPasses handleComplementaryPasses = new HandleComplementaryPasses();
                handleComplementaryPasses.handleComplementaryPasses();
                break;
            case 3:
                HandlePerformances handlePerformances = new HandlePerformances();
                handlePerformances.handlePerformances();
                break;
            case 4:
                System.out.println("Enter the seat number for which the details must be displayed");
                String seatNo = scanner.nextLine();
                event.getSeatDetails(seatNo);
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
}
