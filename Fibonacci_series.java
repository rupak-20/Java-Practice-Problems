//  Java program which will print Fibonacci series, e.g. 1 1 2 3 5 8 13 ... . up to a given number.
//  Input: integer n
//  Output: first n integers in the fibonacci series

import java.util.Scanner;
public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int pre=1;
        int now=1;
        System.out.println(1);
        for(int i=1; i<=n; i++) {
            System.out.println(now);
            int temp=pre;
            pre=now;
            now = temp+now;
        }
        sc.close();
    }
}