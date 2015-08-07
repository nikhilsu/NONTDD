package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = s.nextInt();
        generate(n);
    }
    public static void generate(int n) {
        int fl=0;
        for (int i = 2;i<=n/2; i++)
        {
            if(n%i==0){
                int flag=0;
                for(int k=2;k<=i/2;k++)
                    if(i%k==0)
                        flag+=1;
                if(flag==0) {
                    System.out.print(i + " ");
                    fl+=1;
                }
            }
        }
        if(fl==0)
            System.out.print(n);
    }
}
