import java.util.Scanner;
public class Digitcount {
    public static int number(int n){
        int digits_count=(int)Math.log10(n)+1;
        return digits_count;
    }
    public static int sum(int n){
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum+r;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        System.out.println("Number of digits = "+Digitcount.number(n));
        System.out.println("Sum of digits = "+Digitcount.sum(n));
    }
}
