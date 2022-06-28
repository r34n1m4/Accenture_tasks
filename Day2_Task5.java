package accenture;
import java.util.Scanner;

public class Task5 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the boolean value:");
        boolean bool = sc.nextBoolean();

        System.out.println(!bool);
    }
}
