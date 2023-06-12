import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanman = new Scanner(System.in); /* The Scanner Class allows the program to read input from the user */
        System.out.println("Hello and welcome to the best calculator on the planet!");
        System.out.println("Plesse select one of the following operations:");
        System.out.println("1) Multiply");
        System.out.println("2) Division");
        System.out.println("3) Addition");
        System.out.println("4) Subtraction");
        int operation = scanman.nextInt();
        System.out.println("Please enter your first number: ");
        int FIRST_NUMBER = scanman.nextInt();
        System.out.println("Please enter your second number: ");
        int SECOND_NUMBER = scanman.nextInt();
    int answer;
        if (operation == 1) { /* MULTIPLICATION */
           answer = FIRST_NUMBER*SECOND_NUMBER;
            System.out.println(FIRST_NUMBER+"*"+SECOND_NUMBER+"="+answer);
        }
        if (operation == 2) { /* DIVISION */
            answer = FIRST_NUMBER/SECOND_NUMBER;
            System.out.println(FIRST_NUMBER+"/"+SECOND_NUMBER+"="+answer);
        }
        if (operation == 3) { /* ADDITION */
            answer = FIRST_NUMBER+SECOND_NUMBER;
            System.out.println(FIRST_NUMBER+"+"+SECOND_NUMBER+"="+answer);
        }
        if (operation == 4) { /* SUBTRACTION */
            answer = FIRST_NUMBER-SECOND_NUMBER;
            System.out.println(FIRST_NUMBER+"-"+SECOND_NUMBER+"="+answer);
        }
        System.out.println("Request Complete");
        }
    }
