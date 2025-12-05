import java.lang.*;
import java.util.Scanner;
class Distance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1,x2,y1,y2;
        float Distance;
        System.out.println("Enter 4 coordinate values");
        x1=sc.nextInt();
        x2=sc.nextInt();
        y1=sc.nextInt();
        y2=sc.nextInt();
        Distance = (float)Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        System.out.printf("Distance is %.2f",Distance);
        sc.close();
    }
}
