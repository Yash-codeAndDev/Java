import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;


public class Demo2 {
    public static void main(String[] args) throws IOException {
        
        FileWriter fw = new FileWriter("abc2.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(65);
        bw.newLine();

        char[] ch = {'H','E','L','L','O'};
        bw.write(ch);
        bw.newLine();

        bw.write("Buffered Writer in FileHandeling in Append Mode");
        bw.newLine();

        bw.flush();
        bw.close();
    }
}
