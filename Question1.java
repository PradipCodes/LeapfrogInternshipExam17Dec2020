package com.company;

import java.util.Scanner;

/**
 * @author Pradip Thapa
 * @since 12/18/20
 */
public class Question1 {

        public static void main(String[] args) {
            // write your code here
            int number,number1;
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            number1 = sc.nextInt();

            System.out.println(logic(number,number1));

        }

        public static int logic(int x,int y) {
            // The only power of 1 is 1 itself
            if (y == 1) {
                return 1;
            }
            // Repeatedly compute power of x
            int pow = 1;
            while (pow < x)
                pow = pow * y;

            // Check if power of x becomes y
            if (pow == x)
            {
             return 1;
            }
            else {
                return 0;
            }
        }
}
