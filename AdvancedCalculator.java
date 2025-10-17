import java.util.Scanner;

public class AdvancedCalculator {

    // Overloaded methods for addition
    static int add(int a, int b) { return a + b; }
    static double add(double a, double b) { return a + b; }

    // Overloaded methods for subtraction
    static int subtract(int a, int b) { return a - b; }
    static double subtract(double a, double b) { return a - b; }

    // Multiplication and division
    static double multiply(double a, double b) { return a * b; }

    static double divide(double a, double b) throws ArithmeticException {
        if (b == 0)
            throw new ArithmeticException("Cannot divide by zero!");
        return a / b;
    }

    // Power and square root
    static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    static double sqrt(double num) {
        return Math.sqrt(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("⚙️ Java Advanced Calculator - Hacktoberfest 2025");
        System.out.println("Available operations: add, sub, mul, div, pow, sqrt, exit");

        while (true) {
            System.out.print("\nEnter operation: ");
            String op = sc.next();

            if (op.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye! 👋");
                break;
            }

            try {
                double a, b;
                switch (op.toLowerCase()) {
                    case "add":
                        System.out.print("Enter two numbers: ");
                        a = sc.nextDouble(); b = sc.nextDouble();
                        System.out.println("Result = " + add(a, b));
                        break;
                    case "sub":
                        System.out.print("Enter two numbers: ");
                        a = sc.nextDouble(); b = sc.nextDouble();
                        System.out.println("Result = " + subtract(a, b));
                        break;
                    case "mul":
                        System.out.print("Enter two numbers: ");
                        a = sc.nextDouble(); b = sc.nextDouble();
                        System.out.println("Result = " + multiply(a, b));
                        break;
                    case "div":
                        System.out.print("Enter two numbers: ");
                        a = sc.nextDouble(); b = sc.nextDouble();
                        System.out.println("Result = " + divide(a, b));
                        break;
                    case "pow":
                        System.out.print("Enter base and exponent: ");
                        a = sc.nextDouble(); b = sc.nextDouble();
                        System.out.println("Result = " + power(a, b));
                        break;
                    case "sqrt":
                        System.out.print("Enter a number: ");
                        a = sc.nextDouble();
                        System.out.println("Result = " + sqrt(a));
                        break;
                    default:
                        System.out.println("Unknown operation. Try again.");
                }
            } catch (Exception e) {
                System.out.println("⚠️ Error: " + e.getMessage());
            }
        }
        sc.close();
    }
}
