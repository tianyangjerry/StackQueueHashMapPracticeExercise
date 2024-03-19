package org.example;

/*
This class has no variable of its own. It simply helps you handle complementary passes with the
help of a stack of ComplementaryPasses object. So, create a Stack of ComplementaryPasses
object.
§ handleComplementaryPasses() – This method gives the user the option to choose from the
following operations: 1. Redeem complementary passes; 2. Display all the redeemed
complementary passes; 3. Display the last redeemed complementary pass; 4. Undo any of the
redeemed complementary pass; 5. QUIT
§ Depending on the choice the user makes, the program should do the following:
o 1: Ask the user how many passes needs to be redeemed. Then pass that value as a parameter
to redeemComplementaryPasses() method. This method will first check if the current size of
the stack is more than or qual to 10. If it is, then the operation should not happen, and the
program should display “Invalid operation. All the passes have been redeemed” If the size is
under 10, then the program should allow the user to add Pass ID, and then add the access
level. Using these inputs, the program then pushes the details into the Stack.
2: If the user chooses ‘2’, then simply display all the passes by displaying the Stack. This
feature must be inside a separate method called displayComplementaryPasses().
o 3. If the user chooses ‘3’, then the displayLastRedeemedComplementaryPass() method is
called. The method displays only the top-most entry from the Stack.
o 4. If the user chooses ‘4’, then the undoRedeemedComplementaryPass() method is called.
This method first asks the Pass ID you want to undo (remove), then searches for that ID in the
stack, and then removes it.

 */

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
