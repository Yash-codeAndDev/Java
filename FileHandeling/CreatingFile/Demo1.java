import java.io.*;

public class Demo1 {

    public static void main(String[] args) throws IOException 
    {        
        String name = "abc.txt";
        /*
            Creating java File object to represent specified file or directory
            * it does not create file

            f.exists() -> check if file exists 
        */
        File f = new File(name); 
        
        if (f.exists()){
            System.out.println("File exists ");
        }else{
            System.out.println("File Does not Exist");
        }

        // Creating Physical file if it does not exist else it does nothing if file exist
        f.createNewFile();
        System.out.println(f.exists());
    }
    
}