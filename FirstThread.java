class MyThread1 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Sita Thread");
        }   
    }
}
class MyThread2 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hanuman Thread");
        }   
    }
}
public class FirstThread {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        t1.start();
        MyThread2 t2=new MyThread2();
        t2.start();
        for (int i=0;i<10;i++){
            System.out.println("Rama Thread");
        }
    }
}