import java.util.Scanner;
class PerimeterofRec
{
 public static void main(String args[])
{
     Scanner sc=new Scanner(System.in);
Float len,bre,per;
len=sc.nextFloat();
bre=sc.nextFloat();
per=2*(len+bre);
    System.out.printf("Perimeter is %.2f",per);
  }
}