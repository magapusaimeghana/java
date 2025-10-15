import java.util.Scanner;
public class Average
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        float avg;
        a=sc.nextInt();
        b=sc.nextInt();
        avg=(float)(a+b)/2;
        System.out.printf("Average of %d and %d is: %.2f",a,b,avg);
        sc.close();
    }
}