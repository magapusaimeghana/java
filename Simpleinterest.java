import java.lang.*;
import java.util.Scanner;
class Simpleinterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float P,T,R,S;
        System.out.println("Enter P T R values");
        P=sc.nextFloat();
        T=sc.nextFloat();
        R=sc.nextFloat();
        S=(P*T*R)/100;
        System.out.println("Simple interest "+S);
        
        // BMI

        float weight,height,BMI;
        System.out.println("Enter the value of weight in kg and height in m");
        weight = sc.nextFloat();
        height = sc.nextFloat();
        BMI=weight/(height*height);
        System.out.println("The value of BMI is "+BMI);
        sc.close();

    }    
}
