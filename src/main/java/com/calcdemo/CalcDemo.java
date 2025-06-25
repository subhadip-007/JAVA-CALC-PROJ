package com.calcdemo;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class CalcDemo
{
    public int sum(int a, int b)
    {
        return (a+b);
    }
    public static void main( String[] args )
    {
        CalcDemo obj = new CalcDemo();
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter first number: " );
        int a = sc.nextInt();
        System.out.println( "Enter second number: " );
        int b = sc.nextInt();
        System.out.println( "The SUM is: " + obj.sum(a,b) );
        sc.close();
    }
}
