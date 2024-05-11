import java.io.*;
public class Demo3 {
    public static void main(String[] args) throws IOException {
        
        FileReader fr = new FileReader("abc2.txt");

        FileWriter fw = new FileWriter("abc3.txt");

        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        
        String line = "";

        while ( (line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
        }
        br.close();
        bw.close();
        
    }
}