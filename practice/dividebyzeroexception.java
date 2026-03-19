

import java.util.Scanner;

public class dividebyzeroexception {
    Scanner s= new Scanner(System.in);
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter numerator:");
        int numerator = s.nextInt();
        System.out.println("Enter denominator:");
        int denominator = s.nextInt();
        s.close();
        try {
            int result = numerator / denominator;
            System.out.println("Result:" + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
