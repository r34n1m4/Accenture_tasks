package accenture;
import java.util.Scanner;

public class Task4 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the whole number:");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}
