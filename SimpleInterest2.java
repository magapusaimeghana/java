import java.lang.*;
public class SimpleInterest2 {
    public static void main(String[] args){
        int p=Integer.parseInt(args[0]);
        int t=Integer.parseInt(args[1]);
        int r=Integer.parseInt(args[2]);
        int s=(p*t*r)/100;
        System.out.println(s);
    }
}
