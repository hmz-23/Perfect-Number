package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,Number,sum=0;
        System.out.println("Enter a number:");
        Number = sc.nextInt();
        for(i=1;i<Number;i++)
            if(Number % i == 0)
                sum = sum + i;
        if(sum == Number)
            System.out.println("It is a Perfect Number");
        else
            System.out.println("It is not a Perfect Number");
    }
}
