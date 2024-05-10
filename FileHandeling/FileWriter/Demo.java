import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
public class Demo {
    public static void main(String[] args) throws IOException 
    {
        File f = new File("abc.txt");

        FileWriter fw = new FileWriter(f);
        
        /*
        *   write(int c)
            writes the character corresponding to the Unicode value to the file
        
        *   write(char[] ch) 
            writes entire array to file
        
        *   write(char[] ch, int start, int len)
            writes a portion of the character array starting from index start (inclusive) with a length of len characters
        
        *   write(String str)
            writes entire string to file
        
        *   write(String str,int start,int len)
            writes a portion of the string starting from index start (inclusive) with a length of len characters.
        */

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