interface InterfaceDemo1{
    public void method1();
    public void method2();
}
class Test implements InterfaceDemo1{
    public void method1(){
        System.out.println("This is method Definition");
    }
    public void method2(){
        System.out.println("This is method2 definition");
    }
}
public class InterfaceClass {
    public static void main(String[] args) {
        Test t = new Test();
        t.method1();
        t.method2();
    }
}
