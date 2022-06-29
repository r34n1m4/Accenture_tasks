package accenture;
import java.util.Scanner;



public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert 2 boolean values:");
        boolean b1 = sc.nextBoolean();
        boolean b2 = sc.nextBoolean();
        Compare (b1,b2);
    }
    public static void Compare(boolean a, boolean b) {
        if (a == b)
            System.out.printf("is a equal to b? - %b%n", true);
        else
            System.out.printf("is a equal to b? - %b%n", false);
    }
}
