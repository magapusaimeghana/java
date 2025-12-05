class A{
    int x;
    static int z=10;
    public A(int x){
        this.x=x;
    }
    class B{
        int y;
        public B(int y){
            this.y=y;
        }
        public void displayInfo(){
            System.out.println("Y = "+y);
            System.out.println("X = "+x);
            System.out.println("Z = "+z);
        }
    }

}
public class InnerClassDemo {
    public static void main(String[] args) {
        A a=new A(10);
        //A.B b=a.new B(20);

    }
}
