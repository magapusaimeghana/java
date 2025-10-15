import java.util.Scanner;

public class Calculatesumofarray {
    public static int sum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static int product(int arr[]){
        int pro=1;
        for(int i=0;i<arr.length;i++){
            pro=pro*arr[i];
        }
        return pro;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,x[];
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        int sum_value=sum(x);
        int product_val=product(x);
        System.out.println("sum of the array: "+sum_value);
        System.out.println("Product of the array: "+product_val);
    }
    
}

