package com.h2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int doubleTheNumber(int number) {
        return number * number;
    }

    private static int add(int numbers[]) {
        int sum=0;

        for (int item :numbers) {

            sum=sum+numbers[item];
        }

        return sum;
    }
}
