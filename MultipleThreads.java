class MyThread1 extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning");
            Thread.sleep(1000);
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        while(true){
            System.out.println("Hello");
        }
    }
}
class MyThread3 extends Thread{
    public void run(){
        while(true){
            System.out.println("Welcome");
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class MultipleThreads {
    public static void main(String args[])
    {
        MyThread1 t1=MyThread1();
        MyThread2 t2=MyThread2();
        MyThread3 t3=MyThread3();
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Completed");
    }
}
