import java.lang.*;
import java.util.Scanner;
class Areaofsphere
{
    public static void main(String args[])
    {
        float rad,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rad value:");
        rad=sc.nextFloat();
        area=(4/3)*(3.14f*rad*rad*rad);
        System.out.println("Area of t="+area);
        System.out.printf("Area of triangle=%.0f",area);
    }
}