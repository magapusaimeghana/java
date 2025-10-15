import java.util.Scanner;
class areaoftrapezoid
{
    public static void main(String args[])
  {
        float b1,b2,h,area ;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter b1,b2,h values:");
        b1=sc.nextFloat();
        b2=sc.nextFloat();
        h=sc.nextFloat();
        area=((b1+b2)*h)/2;
        System.out.println("Area of Trapezoid is="+area);
        System.out.printf("Area of Trapezoid=%.0f",area);
}
}