package ie.atu.week8;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {

        {
            File myFile = new File("MyFile.txt");
            System.out.println("My File is located at " + myFile.getAbsolutePath());
            String content = "Details to write";
            try
            {
                PrintWriter myWriter = new PrintWriter(new FileWriter(myFile,true) );
                myWriter.println("This is my First line");
                myWriter.println("This is my Second line");
                myWriter.close();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
            Scanner inputFile = null;
            try {
                inputFile = new Scanner(new File("Student.txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            // Read until the end of the file.
            while (inputFile.hasNext())
            {
                String str = inputFile.nextLine();
                System.out.println(str);
            }

        }

    }
}
