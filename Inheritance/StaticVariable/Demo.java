

/*
    - Static Variable value remain same for all instances
    - Static Variable can be accessed using class name
    - Change in static variable for one instance result in change in all instances
    - Static variables exist for the entire duration of the program execution. 
      They are created when the class is loaded into memory and are destroyed when 
      the class is unloaded (typically when the program terminates).
*/

public class Demo {
    public static void main(String[] args) {
        
        Student obj = new Student(2018877,"Yash Khati",8.5f);
        obj.displayDetails();

        Student obj2 = new Student(1988121,"Ayush Rawat",8.0f);
        obj2.displayDetails();


        obj.university = "GEU"; 
        obj.displayDetails();
        obj2.displayDetails();
        
    }
    
}

class Student
{
    int rollno;
    String fullName;
    float cgpa;
    static String university = "GEHU";
    
    Student(int rollno,String fullName, float cgpa)
    {
        this.rollno = rollno;
        this.fullName = fullName;
        this.cgpa = cgpa;
    }
    void displayDetails()
    {
        System.out.println("Roll No : "+rollno +"\nFull Name :"
        +fullName+"\nCGPA :"+cgpa+"\nUniversity :"+university+"\n");
    }
}