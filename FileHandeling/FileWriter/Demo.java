import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
public class Demo {
    public static void main(String[] args) throws IOException 
    {
        File f = new File("abc.txt");

        FileWriter fw = new FileWriter(f);

        fw.write("Learning Java\nFile Handeling in java\n");
          
        /*
        *  Flush make sure whole data stored in buffer is written in file 
        *  This can be important to ensure that data is not lost in case of 
        *  program termination or unexpected interruptions.
        */
        
        fw.flush();
        fw.close();
    }
    
}