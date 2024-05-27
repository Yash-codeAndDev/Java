package Opps.AccessControl.p1;

public class B extends A{

    int sum;
    B(){
        super(1,2,3,4);
        this.sum = super.n1 + super.n2 + super.n3 + getN4();
    }

    void display(){
        System.out.println(this.n1);
        System.out.println(this.n2);
        System.out.println(this.n3);
    }
}
