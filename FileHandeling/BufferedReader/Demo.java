import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;


public class Demo {

    public static void main(String[] args) throws IOException {

        File f = new File("//workspaces//Java//FileHandeling//BufferedWriter","abc.txt");

        FileReader fr = new FileReader(f);

        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
}
