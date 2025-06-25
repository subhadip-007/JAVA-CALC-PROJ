package com.calcdemo;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class CalcDemo
{
    public Scanner sc = new Scanner(System.in);
    public int sum(int a, int b)
    {
        return a+b;
    }
    public static void main( String[] args )
    {
        System.out.println( "Enter first number: " );
        a = sc.nextLine();
        System.out.println( "Enter second number: " );
        b = sc.nextLine();
        System.out.println( "The SUM is: " + sum(a,b) );
    }
}
