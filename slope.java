import java.util.Scanner;
class slope
{
    public static void main(String args[])
  {
        float x1,y1,x2,y2,sl;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x1,y1,x2,y2 values:");
        x1=sc.nextFloat();
        y1=sc.nextFloat();
        x2=sc.nextFloat();
        y2=sc.nextFloat();
sl=((y2-y1)/(x2-x1));
                System.out.println("slope ="+sl);
        System.out.printf("slope=%.0f",sl);
}
}