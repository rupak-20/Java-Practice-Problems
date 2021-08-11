//  A number is called an Armstrong number if it is equal to the cube of its every digit.
//  For example, 153 is an Armstrong number because of 153= 1+ 125+27, which is equal to 1^3+5^3+3^3.
//  This is a program to check if the given number is Armstrong number or not.
//  Input: 3 digit integer
//  Output: 'Armstrong number' if the number is armstrong number else 'Not an Armstrong number'

import java.util.Scanner;
import java.lang.math;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int t2=n;
        double arm=0;
        while(t2>0) {
            double t1=t2%10, b=3;
            t2=t2/10;
            arm = arm + Math.pow(t1, b);
        }
        if(arm==n)
        System.out.println("Armstrong number");
        else
        System.out.println("Not an Armstrong number");
        sc.close();
    }
}