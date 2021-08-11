//  Java program to check if a given number is prime or not.
//  Remember, a prime number is a number which is not divisible by any other number, e.g. 3, 5, 7, 11, 13, 17, etc.
//  Enhance your algorithm without looping through all the numbers.
//  Input: an integer
//  Output: 'Prime' if the number is prime else 'Not Prime'

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int flag=1;
        int t= (int)Math.sqrt(n);
        for(int i=2; i<=t; i++) {
            if(n%i==0) {
                flag=0;
                System.out.println("Not Prime");
                break;
            }
        }
        if(flag==1)
        System.out.println("Prime");
        sc.close();
        
    }
}