/*import java.util.Scanner;
public class Multipliesoffour {
    public static void print(int n){
        for(int i=4;i<=n;i=i+4){
            System.out.println(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        Multipliesoffour.print(n);
    }
}*/

import java.util.Scanner;
public class Multipliesoffour{
    public static void print(int m,int n){
        for(int i=1;i<=n;i++){

            System.out.println(+m+"x"+i+"="+i*m);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        Multipliesoffour.print(m,n);
    }
}
