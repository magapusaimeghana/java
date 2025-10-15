import java.lang.*;
import java.util.Scanner;
class Areaofcircle{
    public static void main(String args[]){

        //Area of circle

        Scanner sc= new Scanner(System.in);
        float radius,area;
        System.out.println("Enter the radius");
        radius = sc.nextFloat();
        area=3.14f*radius*radius;
        System.out.println("Area of circle :"+area);

        //Perimeter of rectangle

        float l,b,p;
        System.out.println("Enter lenth and breadth");
        l=sc.nextFloat();
        b=sc.nextFloat();
        p=2*(l+b);
        System.out.println("Perimeter of rectangle"+p);
        sc.close();
    }
}
