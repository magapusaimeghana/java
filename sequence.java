import java.util.Scanner;
class sequence
{
    public static void main(String args[])
  {
        float a,n,d,term ;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a,n,d values:");
        a=sc.nextFloat();
        n=sc.nextFloat();
        d=sc.nextFloat();
        term=a+(n-1)*d;
        System.out.println("Nth term of arithmetic sequence is="+term);
        System.out.printf("Nth term of arithmetic sequence=%.0f",term);
}
}