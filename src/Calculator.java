import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("===== Advanced Java Calculator =====");

        while (keepRunning) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Square");
            System.out.println("8. Square Root");
            System.out.println("9. Exit");

            System.out.print("Enter your choice (1-9): ");
            int choice = scanner.nextInt();

            double num1, num2;

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("Result = " + (num1 + num2));
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("Result = " + (num1 - num2));
                    break;

                case 3:
                    System.out.print("Enter two numbers: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("Result = " + (num1 * num2));
                    break;

                case 4:
                    System.out.print("Enter dividend and divisor: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        System.out.println("Result = " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;

                case 5:
                    System.out.print("Enter two numbers: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("Result = " + (num1 % num2));
                    break;

                case 6:
                    System.out.print("Enter base and exponent: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("Result = " + Math.pow(num1, num2));
                    break;

                case 7:
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Square = " + (num1 * num1));
                    break;

                case 8:
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    if (num1 >= 0) {
                        System.out.println("Square Root = " + Math.sqrt(num1));
                    } else {
                        System.out.println("Error: Cannot calculate square root of negative number.");
                    }
                    break;

                case 9:
                    keepRunning = false;
                    System.out.println("Exiting Calculator. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select from 1 to 9.");
            }
        }

        scanner.close();
    }
}
