package org.example;

import java.util.Scanner;
import java.lang.Math;
public class App 
{
    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; ++i) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculator Menu:");
        System.out.println("1. Square Root (sqrt)");
        System.out.println("2. Factorial (x!)");
        System.out.println("3. Natural Logarithm (ln)");
        System.out.println("4. Power (x^y)");
        System.out.println("Enter your choice: ");

        int choice = scanner.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Enter the number: ");
                double num1 = scanner.nextDouble();
                System.out.println("Square Root: " + Math.sqrt(num1));
                break;

            case 2:
                System.out.println("Enter the number: ");
                int num2 = scanner.nextInt();
                int factorial = 1;
                for (int i = 1; i <= num2; ++i) {
                    factorial *= i;
                }
                System.out.println("Factorial: " + factorial);
                break;

            case 3:
                System.out.println("Enter the number: ");
                double num3 = scanner.nextDouble();
                System.out.println("Natural Logarithm: " + Math.log(num3));
                break;

            case 4:
                System.out.println("Enter the base: ");
                double base = scanner.nextDouble();
                System.out.println("Enter the exponent: ");
                double exponent = scanner.nextDouble();
                System.out.println("Power: " + Math.pow(base, exponent));
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
