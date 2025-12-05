import java.util.Scanner;
public class Programofname {
    public static void wish(String name){
        System.out.println("Hello Ms."+name+" Good afternoon");
    }
    public static void main(String[] args) {
        //Programofname.wish("Meghana");
        String name;
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        Programofname.wish(name);
    }
}
