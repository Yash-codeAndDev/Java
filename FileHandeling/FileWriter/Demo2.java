import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
public class Demo2 {
    public static void main(String[] args) throws IOException 
    {
        String pathname = "abc2.txt";
        File f = new File(pathname);

        // Writing on file in append Format
        FileWriter fw = new FileWriter(f,true);

        fw.write("Learning Java\nFile Handeling in java\n");
     
        fw.flush(); 
        fw.close();
    }
    
}