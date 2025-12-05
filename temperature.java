import java.lang.*;
import java.util.Scanner;
class temperature{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float F,C;
        System.out.println("Enter the temperature in celsius :");
        C=sc.nextFloat();
        F=(C*(9/5))+32;
        System.out.println("The temperature in fahrenheit is ",F);
        sc.close();
    }
}
