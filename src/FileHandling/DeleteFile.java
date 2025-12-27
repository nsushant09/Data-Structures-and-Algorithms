package FileHandling;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File myfile = new File("filecreation.txt");
        if(myfile.delete()){
            System.out.println("I have deleted: "+myfile.getName());
        }
        else{
            System.out.println("Some error occured while deleting the file.");
        }
    }
}
