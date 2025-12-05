public class Test {
    public void swap(int x,int y){
        System.out.println("Before swapping: "+x+" "+y);
        int temp=x;
        x=y;
        y=temp;
        System.out.println("After swapping: "+x+" "+y);
    }
    public void swap(double p,double q){
        System.out.println("Before swapping: "+p+" "+q);
        double temp=p;
        p=q;
        q=temp;
        System.out.println("After swapping: "+p+" "+q);
    }
    public static void main(String[] args) {
        Test t1=new Test();
        t1.swap(5,50);
        t1.swap(2.3, 56.263);
        t1.swap('A','B');
    }
}
