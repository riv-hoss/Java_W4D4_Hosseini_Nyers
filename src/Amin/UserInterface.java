package Amin;

import javax.lang.model.type.ArrayType;
import java.util.Scanner;

public class UserInterface {

    public void menu () {
        String hLine = "\n+" + "-".repeat(35) + "+";
        String welcome = "\n|\t\t\t Welcome \t\t\t\t|";
        String vLine = "\n|" + "\t".repeat(9) + "|";
        System.out.println(hLine + welcome + vLine + vLine+ hLine);

        System.out.println("\n\nMake a selection: \n1) Perform action 1. " +
                "\n2) Perform action 2. \n3) Perform action 3. " +
                "\n4) Perform action 4. \n0) Exit.");

        Scanner in = new Scanner(System.in);
        System.out.print("\n\nEnter your choice: ");
        if (!in.hasNextInt()) {
            System.err.println("Enter only a number!");
            throw new ArithmeticException();

        }
        int i = in.nextInt();

        switch (i) {
            case 1:
                System.out.println("Action 1 selected!");
                break;
            case 2:
                System.out.println("Action 2 selected!");
                break;
            case 3:
                System.out.println("Action 3 selected!");
                break;
            case 4:
                System.out.println("Action 4 selected!");
                break;
            default:
                System.err.println("Only a number between 0 - 4 should be selected!");
                throw new IllegalArgumentException();
        }
    }
}
