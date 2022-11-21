package ie.atu.week8;

import java.io.*;
import java.nio.file.Path;

public class CreateFile {
    public static void main(String[] args) {

        {
            File myFile = new File("MyFile.txt");
            System.out.println("My File is located at " + myFile.getAbsolutePath());
            String content = "Details to write";
            try
            {
                FileWriter myWriter = new FileWriter(myFile,true);
                myWriter.write("This is my first line");
                myWriter.close();
            } catch (IOException e)
            {
                e.printStackTrace();
            }

        }

    }
}
