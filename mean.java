import java.util.Scanner;
class mean
{
    public static void main(String args[])
  {
        float x1,x2,x3,x4,x5,x6,C;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x1,x2,x3,x4,x5,x6 values:");
        x1=sc.nextFloat();
        x2=sc.nextFloat();
        x3=sc.nextFloat();
        x4=sc.nextFloat();
        x5=sc.nextFloat();
        x6=sc.nextFloat();
     C=(x1+x2+x3+x4+x5+x6)/6;
        System.out.println(" mean of 6 nums is="+C);
        System.out.printf("mean =%.2f",C);
}
}