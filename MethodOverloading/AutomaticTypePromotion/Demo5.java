class Animal{

}
class Dog extends Animal{

}

public class Demo5
{
    public void m1(Animal a){
        System.out.println("Animal");
    }
    public void m1(Dog d){
        System.out.println("Dog");
    }
    public static void main(String[] args) {
        
        Demo5 t1 = new Demo5();
        
        Animal a = new Animal(); 
        t1.m1(a);   // Animal
        Dog d = new Dog();
        t1.m1(d); // Dog
        Animal obj = new Dog();
        t1.m1(obj); // Animal
    }
}