package w3resource.InputOutputExercises;
/*
Write a Java program to check if a file or directory specified by pathname exists or not.
*/

import java.io.File;

public class Exercise3 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\reanima\\Desktop\\Accenture");
        if (file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File don't exists");
        }
    }
}
