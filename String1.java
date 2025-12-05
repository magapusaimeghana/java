public class String1 {
    public static void main(String[] args) {
        String s1="Meghana";
        String s2 = new String("Meghana");
        String s3 = "Meghana";
        String s4 = new String("Meghana");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s3);
        System.out.println(s2==s4);
    }
}
