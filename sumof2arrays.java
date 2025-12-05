import java.util.Scanner;
public class sumof2arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,x[],y[];
        n=sc.nextInt();
        x=new int[n];
        y=new int[n];
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            y[i]=sc.nextInt();
        }
        int z[];
        z=new int[n];
        for(int i=0;i<n;i++){
            z[i]=x[i]+y[i];
            System.out.println(z[i]+" ");
        }
    }
}
