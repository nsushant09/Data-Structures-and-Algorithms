package FileHandling;

import java.io.File;
import java.io.IOException;

public class Creating {
    public static void main(String[] args){
        //how to create a file.
        File file = new File("filecreation.txt");
        try {
            file.createNewFile();
        }
        catch (IOException e) {
                e.printStackTrace();
        }
    }
}
