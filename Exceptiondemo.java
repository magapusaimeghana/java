import java.util.*;
import java.io.*;
class InvalidVoterException extends Exception{
    public InvalidVoterException(){
        super();
    }
    public InvalidVoterException(String msg){
        super(msg);
    }
}
public class Exceptiondemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age;
        try{
            age=sc.nextInt();
            if (age<18)
                throw new InvalidVoterException("You are minor and not eligible");
            System.out.println("You are eligible");
        }
        catch(InputMismatchException me){
            System.out.println("Input was wrong");
        }
    }
}
