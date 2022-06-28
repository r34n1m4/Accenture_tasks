package accenture;
import java.util.Scanner;

public class Task6 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 2 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Compare(a,b);
    }
    public static void Compare (int a, int b) {
        if (a == b || (a < 0 && b > 0) || (a > 100 && b > 100)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
