package w3resource.InputOutputExercises;
/*
Write a Java program to read first 3 lines from a file.
*/
import java.io.*;

public class Exercise17 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\reanima\\Desktop\\Accenture\\test.txt");
        BufferedReader bufferedReader = null;
        String strLine = "";
        try {
            LineNumberReader lineNumberReader =
                    new LineNumberReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            while (((strLine = lineNumberReader.readLine()) != null) && lineNumberReader.getLineNumber() <= 3) {
                System.out.println(strLine);
            }
            lineNumberReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}
