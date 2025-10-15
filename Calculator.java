/*import java.util.Scanner;
public class Calculator {
    public static int add(int x,int y){
        return x+y;
    }
    public static int sub(int x,int y){
        return x-y;
    }
    public static int mul(int x,int y){
        return x*y;
    }
    public static int div(int x,int y){
        return x/y;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        int a=Calculator.add(m,n);
        int b=Calculator.sub(m,n);
        int c=Calculator.mul(m,n);
        int d=Calculator.div(m,n);
        System.out.println("Sum="+a);
        System.out.println("Difference="+b);
        System.out.println("Product="+c);
        System.out.println("Division="+d);
    }
}*/
public class Calculator 
{
    // 1. Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    //2. Method to add two floating-point numbers
    public double add(double a, double b) {
        return a + b;
    }

    //3. Method to add an array of integers
    public int add(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    //4. Method to add an array of floating-point numbers
    public double add(double[] numbers) {
        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Testing addition of integers
        int intSum = calculator.add(5, 10);
        System.out.println("Sum of integers: " + intSum);  // Output: Sum of integers: 15

        // Testing addition of floating-point numbers
        double doubleSum = calculator.add(5.5, 10.3);
        System.out.println("Sum of doubles: " + doubleSum);  // Output: Sum of doubles: 15.8

        // Testing addition of an array of integers
        int[] intArray = {1, 2, 3, 4, 5};
        int arrayIntSum = calculator.add(intArray);
        System.out.println("Sum of integer array: " + arrayIntSum);  // Output: Sum of integer array: 15

        // Testing addition of an array of floating-point numbers
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        double arrayDoubleSum = calculator.add(doubleArray);
        System.out.println("Sum of double array: " + arrayDoubleSum);  // Output: Sum of double array: 16.5
    }
}

