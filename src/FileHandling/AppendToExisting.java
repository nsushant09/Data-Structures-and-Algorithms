package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendToExisting {
    public static void main(String[] args) {
        File file = new File("filecreation.txt");
        try{
            Scanner in = new Scanner(System.in);
            FileWriter fileWriter = new FileWriter(file,true);
            String str = " ";
            while(!str.equals("")){
                System.out.println("Enter a string : ");
                str = in.nextLine();
                if(!str.equals("")){
                    fileWriter.write(str+"\n");
                }
            }
            fileWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
