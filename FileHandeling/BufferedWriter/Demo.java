import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo{
    public static void main(String[] args) throws IOException {
        
        FileWriter fw = new FileWriter("abc.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(65);
        bw.newLine();

        char[] ch = {'H','E','L','L','O'};
        bw.write(ch);
        bw.newLine();

        bw.write("Buffered Writer in FileHandeling");
        bw.newLine();

        bw.flush();
        bw.close();

    }
}