package w3resource.InputOutputExercises;
/*
Write a Java program to get a list of all file/directory names from the given.
*/

import java.io.File;

public class Exercise1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\reanima\\Desktop\\Accenture");
        String[] fileList = file.list();
        for (String name : fileList) {
            System.out.println(name);
        }
    }
}
