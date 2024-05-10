import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo3
{
    public static void main(String[] args) throws IOException {
        
        // efficient way to use read(char [])

        File f =  new File("//workspaces//Java//FileHandeling//FileWriter","abc.txt");

        
        char[] buffer = new char[(int)f.length()];

        FileReader fr = new FileReader(f);
      
        
        int bufferSize = fr.read(buffer);
        /* 
            for(char ch : buffer)
            {
                System.out.print(ch);
            }
        */
        System.out.println(new String(buffer));
        fr.close();
    }
}
