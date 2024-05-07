
/*
    Static variable and Method Inside Same Class:
    - We can directly use them
  
    Static variable and Method Inside Another Class:
    - We can use them using class name

    - We cannot call instance method or access instance variable inside static
      method
*/

public class Demo {

    public static void d1(){
        System.out.println("Static method inside DEMO");
    }
    
    public static void main(String[] args) 
    {
        d1();

        // display1();
        ABC.display1();
        
        System.out.println("Name : "+ABC.name);

    }
    
}

class ABC {

    static String name = "Yash";
    int a;
    
    ABC()
    {
        this.a = 30;
    }

    public static void display1(){
        System.err.println("Static Method inside Student");
        // display2() -> Error
        
        System.out.println("Accessing static variable : "+name);
        // System.out.println("Accessing instance variable : "+a); -> Error
    }

    public void display2(){
        System.err.println("Instance Method inside Student");
        System.out.println("Accessing instance variable : "+a);
        display1();
    }
}