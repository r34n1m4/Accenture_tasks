package w3resource.InputOutputExercises;
/*
Write a Java program to check if a file or directory has read and write permission.
*/

import java.io.File;

public class Exercise4 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\reanima\\Desktop\\Accenture");
        if (file.canRead() && file.canWrite()) {
            System.out.printf("File %s has Read and Write permissions.", file.getAbsolutePath());
        } else if (file.canRead() && !file.canWrite()) {
            System.out.printf("File %s has Read only permission.", file.getAbsolutePath());
        } else if (!file.canRead() && file.canWrite()) {
            System.out.printf("File %s has Write only permission.", file.getAbsolutePath());
        } else {
            System.out.printf("File %s hasn't Read and Write permissions.", file.getAbsolutePath());
        }
    }
}
