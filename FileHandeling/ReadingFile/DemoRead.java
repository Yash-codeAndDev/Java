import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class DemoRead
{
	public static void main(String[] args) throws IOException {

		String path = "file1.txt";
		File file = new File(path);
		
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

        int c = 0;
        while( (c = br.read()) != -1){
            System.out.print((char)c);
        }

		br.close();
		fr.close();

	}

}