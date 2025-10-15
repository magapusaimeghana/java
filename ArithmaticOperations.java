import java.lang.*;
import java.util.Scanner;
class ArithmaticOperations{
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        int add=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        System.out.println("Sum = "+add);
        System.out.println("Difference = "+sub);
        System.out.println("Multiplication = "+mul);
        System.out.println("Division = "+div);
        sc.close();
    }
}