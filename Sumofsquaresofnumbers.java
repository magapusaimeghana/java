import java.util.Scanner;
public class Sumofsquaresofnumbers {
    public static int code(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i*i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int result=code(n);
        System.out.println("Sum of squares of natural numbers = "+result);
    }
}
