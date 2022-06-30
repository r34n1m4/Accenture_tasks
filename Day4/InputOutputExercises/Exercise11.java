package w3resource.InputOutputExercises;
/*
Write a Java program to read a file content line by line.
*/

import java.io.*;

public class Exercise11 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\reanima\\Desktop\\Accenture\\test.txt");
        try {
            BufferedReader reader = new BufferedReader
                    (new FileReader(file));
            String fileContent;
            fileContent = reader.readLine();
            while (fileContent != null) {
                System.out.println(fileContent);
                fileContent = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
