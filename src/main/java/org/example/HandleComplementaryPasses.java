package org.example;

import java.util.Scanner;
import java.util.Stack;

public class HandleComplementaryPasses {
    Stack<ComplementaryPasses> complementaryPasses = new Stack<>();
    Scanner scanner = new Scanner(System.in);
    private String choose;
    public void handleComplementaryPasses() {
        boolean flag = true;
        while (flag) {
            System.out.println("What do you want to do?");
            System.out.println("1. Redeem complementary passes");
            System.out.println("2. Display all the redeemed complementary passes");
            System.out.println("3. Display the last redeemed complementary pass");
            System.out.println("4. Undo any of the redeemed complementary pass");
            System.out.println("5. QUIT");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the number of passes you want to redeem");
                    int passes = scanner.nextInt();
                    redeemComplementaryPasses(passes);
                    break;
                case 2:
                    displayComplementaryPasses();
                    break;
                case 3:
                    displayLastRedeemedComplementaryPass();
                    break;
                case 4:
                    undoRedeemedComplementaryPass();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public void redeemComplementaryPasses(int passes) {
        if (complementaryPasses.size() >= 10) {
            System.out.println("Invalid operation. All the passes have been redeemed");
        } else {
            for (int i = 0; i < passes; i++) {
                System.out.println("Enter the pass ID");
                String passID = scanner.next();
                System.out.println("Enter the access level");
                String accessLevel = scanner.next();
                complementaryPasses.push(new ComplementaryPasses(passID, accessLevel));
            }
        }
    }

    public void displayComplementaryPasses() {
        for (ComplementaryPasses complementaryPass : complementaryPasses) {
            System.out.println(complementaryPass);
        }
    }

    public void displayLastRedeemedComplementaryPass() {
        System.out.println(complementaryPasses.peek());
    }

    public void undoRedeemedComplementaryPass() {
        System.out.println("Enter the pass ID you want to undo");
        String passID = scanner.next();
        for (int i = 0; i < complementaryPasses.size(); i++) {
            if (complementaryPasses.get(i).getPassID().equals(passID)) {
                complementaryPasses.remove(i);
            }
        }
    }
}
