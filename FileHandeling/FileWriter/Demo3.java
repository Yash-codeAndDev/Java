import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        
        FileReader fr = new FileReader("abc2.txt");

        FileWriter fw = new FileWriter("abc3.txt");

        int ch;
        while ( (ch = fr.read()) != -1){
            fw.write(ch);
        }
        fw.close();
        fr.close();
    }    
}
