
package com.company;

/**
 * @author Pradip Thapa
 * Created on 12/18/20
 */

import java.util.*;

public class Question2 {

    public static void main(String[] args) {
        // write your code here
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        System.out.println(logic(number));

    }

    public static int logic(int x) {
        int[] num;
        num = new int[20];
        int sum = 0, sum1 = 0, count = 0;
        int length = String.valueOf(x).length();
        while (count == 0 || sum > 9) {
            count=1;
            if(count==1 && sum>9)
            {
                length=String.valueOf(sum).length();
                sum=0;
                sum1=0;

            }
            for (int i = 1; i <= length; i++) {
                int y = x % 10;
                x = x / 10;
                num[i] = y;
            }
            int m = length / 2;
            int n = length;
            if (length % 2 == 0) {
                for (int i = 1; i <= m; i++) {
                    sum1 = num[i] * num[n];
                    n = n - 1;
                    sum = sum + sum1;
                    x=sum;

                }
            }
            else {
                for (int i = 1; i <= m; i++) {
                    sum1 = num[i] * num[n];
                    n = n - 1;
                    sum = sum + sum1;
                }
                sum = sum + num[n];

            }
            x=sum;



        }
        return sum;
    }
}

