package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = s.nextInt();
        for (int i = 1;i<=n; i++)
        {
            if((i%3==0)&&(i%5==0)){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else
                System.out.println(i);
        }
    }
}

