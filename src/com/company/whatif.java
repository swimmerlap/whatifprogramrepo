/*
Program: Whatif program oct4 . prgram if sum, multiples(product), average of two numbers
Name:GH

 */



package com.company;

import java.util.Scanner;

    public class whatif {

        public static void main(String[] args) {
            int num1;
            int num2;
            int sum;
            int product;
            int average;

            Scanner keyboard = new Scanner(System.in);

            System.out.print("First number? : ");
            num1 = keyboard.nextInt();                      //get number from keyboard


            System.out.print("Second number? : ");
            num2 = keyboard.nextInt();                      //get number from keyboard

            sum = num1 + num2;                              // add variable num1 and variable num2 together
            product = num1 * num2;
            average = sum / 2;


            if (sum > 100)
            {
                System.out.println(sum + "*");
            }


            if (sum < 1000)
            {
                System.out.println(sum + "~");
            }

        }
    }



