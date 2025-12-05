import java.util.Scanner;
public class Expression1
{
   public static int calculate(int x,int n)
   {
      int sum=1;
      for(int i=1;i<=n;i++)
	  {
	     sum=sum+(int)Math.pow(x,i);
	  }
	  return sum;
   }
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
	  int x,n;
	  x=sc.nextInt();
	  n=sc.nextInt();
	  int result=Expression1.calculate(x,n);
	  System.out.println(result);
   }
}

