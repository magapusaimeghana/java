import java.util.Scanner;
public class exceptiondemo1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        /*int x,y,z;
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
        z=x/y;
        System.out.println("Result = "+z);
        System.out.println("Task is completed");
        sc.close();*/
        int x=0,y=0,z=0;
        try{
            x=sc.nextInt();
            y=sc.nextInt();
            z=x/y;
        }
        catch(Exception e){
            System.out.println("Y value should be non zero");
        }
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
        z=x/y;
        System.out.println("Result = "+z);
        System.out.println("Task is completed");
        sc.close();
    }
}
