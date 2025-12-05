interface I1{
    void wish();
    void message();
}
interface I2{
    void wish();
    void show();
}
class Test implements I1,I2{
    public void wish(){
        System.out.println("This is wish method");
    }
    public void show(){
        System.out.println("This is show method");
    }
    public void message(){
        System.out.println("This is message method");
    }
}
public class MultipleinheritanceDemo{
    public static void main(String[] args) {
        Test t=new Test();
        t.show();
        t.message();
        t.wish();
    }
}
