package FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteInFile {
    public static void main(String[] args) {
        //code to write to a file.
        //use file writer class
        try {
            FileWriter fileWriter = new FileWriter("filecreation.txt");
            fileWriter.write("Hello this is sushant\nThis is the second line.");
            for (int i = 0; i < 3; i++) {
                Scanner in = new Scanner(System.in);
                String str;
                System.out.println("Enter a string : ");
                str = in.nextLine();
                fileWriter.write("\n"+str);
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
