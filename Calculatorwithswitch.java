import java.util.Scanner;
public class Calculatorwithswitch {
    public static int calc(){
        Scanner sc=new Scanner(System.in);
        int opt,value1,value2;
        System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div");
        System.out.println("Enter your choice");
        opt=sc.nextInt();
        System.out.println("Enter any two numbers");
        value1=sc.nextInt();
        value2=sc.nextInt();
        switch(opt){
            case 1:
            return value1+value2;
            case 2:
            return value1-value2;
            case 3:
            return value1*value2;
            case 4:
            return value1/value2;
            default:
            return -1;
        }
    }
    public static void main(String[] args) {
        int result=Calculatorwithswitch.calc();
        System.out.println(result);
    }
}
/*import java.util.Scanner;
public class Calculatorwithswitch {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int choice, num1, num2;
        System.out.println("Enter any number:\n1.Add\n2.Sub\n3.Pro\n4.Div");
        choice=sc.nextInt();
        System.out.println("Enter any two numbers:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        
        switch (choice)

        {
            case 1:
              System.out.println(num1+num2);
              break;
            case 2:
              System.out.println(num1-num2);
              break;
            case 3:
              System.out.println(num1*num2);
              break;
            case 4:
           System.out.println(num1/num2);
              break;
            default:
               System.out.println("Invalid");
               break;
        }
    }
}*/
