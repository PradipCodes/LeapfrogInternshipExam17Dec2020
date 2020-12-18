package com.company;

import java.util.*;

/**
 * @author Pradip Thapa
 * Created on 12/18/20
 */

public class Question3 {
    public static void main(String[] args){
        String input;
        Scanner sc=new Scanner(System.in);
        input=sc.nextLine();
       System.out.println(logic(input));
    }

    public static int logic(String input){
        int length = input.length();
        int x=Integer.parseInt(input);
        int[] num;
        int happy=0;
        num = new int[20];
        for (int i = 1; i <= length; i++) {
            int y = x % 10;
            x = x / 10;
            num[i] = y;
        }

        for (int i=1;i<=length;i++)
        {
            if(i==1)
            {
                System.out.println(i);
                if(num[1]==1 && num[2]==1)
                {
                    happy=happy+1;
                }
                else if(num[1]==0 && num[2]==0)
                {
                    happy=happy+1;
                }
            }
            else if(i==length)
            {
                System.out.println(i);
                if(num[length]==1 && num[length-1]==1)
                {
                    happy=happy+1;
                }
                else if(num[length]==0 && num[length-1]==0)
                {
                    happy=happy+1;
                }

            }
            else
            {
                System.out.println(i);
                if(num[i]==1)
                {
                    if(num[i-1]!=0 || num[i+1]!=0)
                    {
                        happy=happy+1;
                    }
                }
                if(num[i]==0)
                {
                    if(num[i-1]!=1 || num[i+1]!=1)
                    {
                        happy=happy+1;
                    }
                }
            }


        }

        return happy;

    }

}

