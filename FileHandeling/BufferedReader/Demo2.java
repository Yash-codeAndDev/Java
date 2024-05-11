import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;


public class Demo2 {

    public static void main(String[] args) throws IOException {

        File f = new File("//workspaces//Java//FileHandeling//BufferedWriter","abc.txt");

        FileReader fr = new FileReader(f);

        BufferedReader br = new BufferedReader(fr);

        int i = br.read();
        while( i != -1){
            System.out.print((char)i);
            i= br.read();
        }

        /*
         * We do not need to closr br because it will be  closed automatically 
        */
    }
}
