package Opps.AccessControl.p1;

public class A {
    public  int n1;

    protected  int n2;

    int n3;

    // can be accessed from within class only
    private  int n4;

    public A(int n1, int n2, int n3, int n4) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
    }

    public void setN4(int num)
    {
        this.n4 = num;
    }

    public int getN4() {
        return n4;
    }
}
