import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double majorMinorVersion = 1.2; // This is the major and the minor version (first 2 numbers in the build version)
        int microVersion = 1; // This is the .1 after the major and the minor version (the last number with the build version)
        String buildVersion = majorMinorVersion+"."+microVersion;
        Scanner scanner = new Scanner(System.in); /* The Scanner Class allows the program to read input from the user */
        System.out.println("Welcome to the best calculator on the planet! (Build: "+buildVersion+")");
        System.out.println("Please select one of the following operations:");
        System.out.println("1) Multiply");
        System.out.println("2) Division");
        System.out.println("3) Addition");
        System.out.println("4) Subtraction");
        int operation = scanner.nextInt();
        System.out.println("Please enter your first number: ");
        int FIRST_NUMBER = scanner.nextInt();
        System.out.println("Please enter your second number: ");
        int SECOND_NUMBER = scanner.nextInt();
        boolean failedStatus = false;
        int answer;
        switch (operation) {
            case 1 -> { // MULTIPLICATION
                answer = FIRST_NUMBER * SECOND_NUMBER;
                System.out.println(FIRST_NUMBER + "*" + SECOND_NUMBER + "=" + answer);
            }
            case 2 -> { // DIVISION
                answer = FIRST_NUMBER / SECOND_NUMBER;
                System.out.println(FIRST_NUMBER + "/" + SECOND_NUMBER + "=" + answer);
            }
            case 3 -> { // ADDITION
                answer = FIRST_NUMBER + SECOND_NUMBER;
                System.out.println(FIRST_NUMBER + "+" + SECOND_NUMBER + "=" + answer);
            }
            case 4 -> { // SUBTRACTION
                answer = FIRST_NUMBER - SECOND_NUMBER;
                System.out.println(FIRST_NUMBER + "-" + SECOND_NUMBER + "=" + answer);
            }
            default -> { // Fail safe
                failedStatus = true;
                System.out.println("You did not select a valid operation!");
            }
        }
        if (!failedStatus) { // Checks if the code is successful or not
            System.out.println("Calculation Complete!");
        }
    }
}
