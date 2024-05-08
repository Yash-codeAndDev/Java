import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Demo
{
	public static void main(String[] args) throws IOException {

		String path = "file1.txt";
		File file = new File(path);
		
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);

		String s1 = "Learning How to create File in Java";
		bw.write(s1);

		bw.close();
		fw.close();

	}

}