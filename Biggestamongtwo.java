import java.util.Scanner;
public class Biggestamongtwo {
    public static int findbiggest(int x,int y){
        if(x>=y)
        return x;
        else
        return y;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        int larger=Biggestamongtwo.findbiggest(m,n);
        System.out.println("the biggest number among "+m+" and "+n+" is: "+larger);
        sc.close();
    }
}
