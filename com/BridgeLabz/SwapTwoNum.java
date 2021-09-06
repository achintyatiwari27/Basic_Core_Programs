package.com.BridgeLabz;

import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number");
        int num2 = sc.nextInt();
        t = num1;
        num1 = num2;
        num2 = t;
        System.out.println("Value after swapping the numbers :" + num1 + " " + num2 );
    }
}
