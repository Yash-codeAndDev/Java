import java.io.IOException;
import java.io.PrintWriter;

public class Demo {
    public static void main(String[] args) throws IOException {
        
        PrintWriter pw = new PrintWriter("abc.txt");

        // Writing nornal character data
        pw.write("Hello , How are You ?");

        // write data and add newline automatically
        pw.println("My name is Yash Khati");

        // writing Primitive dat
        pw.write(100); // converts to d
        pw.println(100); 
        pw.print('A');
        pw.print(22);
        pw.println('c');
        
        pw.flush();
        pw.close();

    }
}