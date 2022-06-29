package accenture;

import java.util.Scanner;

public class Task1 {
    public static void main (String [] args) {

        System.out.println("Input 2 integers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Compare(a, b);
    }

    public static void Compare(int a, int b) {
        if (a == b)
            System.out.printf("is %d equal to %d? - %b%n", a, b, true);
        else
            System.out.printf("is %d equal to %d? - %b%n", a, b, false);
        if (a < b)
            System.out.printf("is %d less to %d? - %b%n", a, b, true);
        else
            System.out.printf("is %d less to %d? - %b%n", a, b, false);
        if (a <= b)
            System.out.printf("is %d less or equals to %d? - %b%n", a, b, true);
        else
            System.out.printf("is %d less or equals to %d? - %b%n", a, b, false);
        if (a > b)
            System.out.printf("is %d greater than %d? - %b%n", a, b, true);
        else
            System.out.printf("is %d greater than %d? - %b%n", a, b, false);
        if (a >= b)
            System.out.printf("is %d greater or equal %d? - %b%n", a, b, true);
        else
            System.out.printf("is %d greater or equal %d? - %b%n", a, b, false);
    }
}

