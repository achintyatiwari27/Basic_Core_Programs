package.com.BridgeLabz;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for computation of Quotient and Remainder");
        int number = sc.nextInt();
        System.out.println("Enter the divisor: ");
        int divisor = sc.nextInt();
        int quotient = number / divisor;
        int remainder = number % divisor;
        System.out.println("The Quotient of the number is "+quotient);
        System.out.println("The Remainder of the number is "+remainder);
    }
}
