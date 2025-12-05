import java.util.*; 
import java.io.*; 
class InValidVoterException extends Exception 
{ 
    public InValidVoterException() 
    { 
        super(); 
    } 
    public InValidVoterException(String msg) 
    { 
        super(msg); 
    } 
} 
class Voter 
{ 
    public static void main(String args[]) 
    {   
        Scanner sc=new Scanner(System.in); 
        int age; 
        try 
        { 
            age=sc.nextInt(); 
            if(age<18) 
                throw new InValidVoterException("You are Minor and not eligible for vote"); 
            System.out.println("You are eligible for Vote"); 
        } 
        catch(InputMismatchException me) 
        { 
            System.out.println("Input should be integer"); 
        } 
        catch(InValidVoterException ae) 
        { 
            System.out.println(ae); 
        } 
        catch(Exception e) 
        { 
            System.out.println(e); 
        } 
    } 
} 
