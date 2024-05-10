import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class Demo2 {

    public static void main(String[] args) throws IOException {
        

        File f =  new File("//workspaces//Java//FileHandeling//FileWriter","abc.txt");

        FileReader fr = new FileReader(f);
        /*
           read(char []) -> return type int
           returns int value indicating numbers of characters read into array
           If no characters are available to be read because the end of the stream has been reached, the method returns -1.
        */

        char[] buffer = new char[10];

        int charRead = 0;

        while ( (charRead = fr.read(buffer)) != -1){
            String content = new String(buffer,0,charRead);
            System.out.print(content);
        }

        fr.close();
    }    
}
