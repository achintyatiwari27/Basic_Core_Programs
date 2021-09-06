package com.BridgeLabz;

import java.util.Scanner;

public class flipcoin {
    static double flipCoin = 0; static int coin;
    static int headCount = 0; static int tailCount = 0;

    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        System.out.println("How many times you want to flip the coin" );
        flipCoin = cn.nextInt();
        cn.close();

      for ( int i=0; i < flipCoin; i++) {
          coin =  (int) Math.floor(Math.random()*2);
        System.out.println("Last Flip value : " + coin);
          headCount = (int) (flipCoin - tailCount);
          tailCount = (int) (flipCoin - headCount);

        if (coin < 0.5) {
            System.out.println("It's Tails");
               tailCount++;
        } else {
            System.out.println("It's Heads");
               headCount++;  }
      }
        System.out.println("Percentage of Heads: " + headCount * 100 / flipCoin);
        System.out.println("Percentage of Tails: " + tailCount * 100 / flipCoin);
    }
}
