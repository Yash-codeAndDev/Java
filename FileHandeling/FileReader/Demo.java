import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

public class Demo {

    public static void main(String[] args) throws IOException {
        
        // String currDir = System.getProperty("user.dir");
        // System.out.println(currDir);

        File f =  new File("//workspaces//Java//FileHandeling//FileWriter","abc.txt");

        FileReader fr = new FileReader(f);
        /*
        *  read() -> return type int
           returns unicode value of next character  
        */
        int i = fr.read();
        while (i != -1) {
            System.out.print((char)i);
            i = fr.read();
        }
        fr.close();
    }    
}
