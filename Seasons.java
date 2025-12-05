import java.util.Scanner;

public class Seasons {
    public static void code(int x){
        if(x==3||x==4||x==5)
        System.out.println("Summer");
        else if(x==6||x==7||x==8||x==9)
        System.out.println("Rainy");
        else if(x==10||x==11||x==12||x==1||x==2)
        System.out.println("Winter");
        else 
        System.out.println("No season");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Seasons.code(a);
    }
}
