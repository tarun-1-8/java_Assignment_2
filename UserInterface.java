// Calculator Application using Method Overloading
import java.util.Scanner;

class Calculator {

    // Addition of two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Addition of two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Addition of three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Subtraction of two integers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication of two double values
    public double multiply(double a, double b) {
        return a * b;
    }

    // Division of two integers
    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        } else {
            return (double) a / b;
        }
    }
}

public class UserInterface {

    private Scanner input = new Scanner(System.in);
    private Calculator calculator = new Calculator();

    public void performAddition() {
        System.out.println("Choose addition type:");
        System.out.println("1. Add two integers");
        System.out.println("2. Add two doubles");
        System.out.println("3. Add three integers");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter first integer: ");
            int a = input.nextInt();
            System.out.print("Enter second integer: ");
            int b = input.nextInt();
            System.out.println("Result: " + calculator.add(a, b));
        } else if (choice == 2) {
            System.out.print("Enter first double: ");
            double a = input.nextDouble();
            System.out.print("Enter second double: ");
            double b = input.nextDouble();
            System.out.println("Result: " + calculator.add(a, b));
        } else if (choice == 3) {
            System.out.print("Enter first integer: ");
            int a = input.nextInt();
            System.out.print("Enter second integer: ");
            int b = input.nextInt();
            System.out.print("Enter third integer: ");
            int c = input.nextInt();
            System.out.println("Result: " + calculator.add(a, b, c));
        } else {
            System.out.println("Invalid choice!");
        }
    }

    public void performSubtraction() {
        System.out.print("Enter first integer: ");
        int a = input.nextInt();
        System.out.print("Enter second integer: ");
        int b = input.nextInt();
        System.out.println("Result: " + calculator.subtract(a, b));
    }

    public void performMultiplication() {
        System.out.print("Enter first double: ");
        double a = input.nextDouble();
        System.out.print("Enter second double: ");
        double b = input.nextDouble();
        System.out.println("Result: " + calculator.multiply(a, b));
    }

    public void performDivision() {
        System.out.print("Enter first integer: ");
        int a = input.nextInt();
        System.out.print("Enter second integer: ");
        int b = input.nextInt();

        double result = calculator.divide(a, b);
        System.out.println("Result: " + result);
    }

    public void mainMenu() {
        int choice;
        do {
            System.out.println("\n--- Welcome to the Calculator Application ---");
            System.out.println("1. Add Numbers");
            System.out.println("2. Subtract Numbers");
            System.out.println("3. Multiply Numbers");
            System.out.println("4. Divide Numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1) {
                performAddition();
            } else if (choice == 2) {
                performSubtraction();
            } else if (choice == 3) {
                performMultiplication();
            } else if (choice == 4) {
                performDivision();
            } else if (choice == 5) {
                System.out.println("Exiting the program. Goodbye!");
            } else {
                System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);
    }

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.mainMenu();
    }
}