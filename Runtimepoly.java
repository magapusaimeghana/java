class A{
    public void m1(){
        System.out.println("A Method");
    }
}
class B extends A{
    public void m1(){
        System.out.println("B Method");
    }
}
class C extends A{
    public void m1(){
        System.out.println("C Method");
    }
}
public class Runtimepoly {
    public static void main(String[] args) {
        A a;
        a=new A();
        a.m1();
        a=new B();
        a.m1();
        a=new C();
        a.m1();
    }
}
