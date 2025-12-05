import java.lang.*;
import java.util.Scanner;
class Degree1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Float rad,deg;
        deg=sc.nextFloat();
        rad=deg*((3.14f)/180);
        System.out.printf("Conversion of degree is %.2f",rad);
    }
}