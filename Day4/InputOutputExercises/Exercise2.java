package w3resource.InputOutputExercises;
/*
Write a Java program to get specific files by extensions from a specified folder.
*/

import java.io.File;
import java.io.FilenameFilter;
import java.util.Locale;

public class Exercise2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\reanima\\Desktop\\Accenture");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".pdf")) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f : list) {
            System.out.println(f);
        }
    }
}
