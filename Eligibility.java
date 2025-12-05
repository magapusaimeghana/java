import java.util.Scanner;
public class Eligibility {
    public static boolean vote(int x)
    {
        if(x>=18)
          return true;
        else
          return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age;
        age=sc.nextInt();
        boolean status=vote(age);
        if(status)
        System.out.println("You are eligible for the vote");
        else
        System.out.println("You are not eligible for the vote");
    }
}
