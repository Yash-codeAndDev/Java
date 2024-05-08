
public class Demo extends Student{

    public void display(){
        System.out.println("Display called inside Demo");
        System.out.println("fullName : "+fullName+
        "\nrollno : "+rollno+
        "\nUniversity : "+university);
    }
    public static void main(String[] args) {
        
        System.out.println(university);
        Demo obj = new Demo();
        obj.display();
    }    
}


class Student{
    int rollno;
    String fullName;
    static String university="GEHU";

    Student(){
        System.out.println("Constructor Called");
    
    }

    Student(int rollno,String fullName)
    {
        System.out.println("Constructor Called");
        this.rollno = rollno;
        this.fullName = fullName;
    }

    // public void display(){
    //     System.out.println("fullName : "+fullName+
    //     "\nrollno : "+rollno+
    //     "\nUniversity : "+university);
    // }
}