import java.util.Scanner;
public class Sumofnaturalnumbers {
    public static int code(int n){
        int sum=0;
        sum=(n*(n+1))/2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int result=Sumofnaturalnumbers.code(n);
        System.out.println("sum of the natural number = "+result);
    }
}
