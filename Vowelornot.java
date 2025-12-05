import java.util.Scanner;
public class Vowelornot {
    public static String findit(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        return "Vowel";
        else
        return "Consonant";
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        char ch;
        ch=sc.next().charAt(0);
        String output=Vowelornot.findit(ch);
	    System.out.println("The given Character "+ch+" is: "+output);
	    sc.close();
    }
}
