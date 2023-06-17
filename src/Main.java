import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); /* The Scanner Class allows the program to read input from the user */
        System.out.println("Hello and welcome to the best calculator on the planet!");
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
                System.out.println("That is not a valid operation");
            }
        }
        if (!failedStatus) { // Calculation successful checker/indicator
            System.out.println("Calculation Complete!");
        }
    }
}
