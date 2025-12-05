public class StringOperations{
    public static void main(String args[])
    {
        String s1="Life is Beautiful";
        System.out.println("Given string is"+s1);

        System.out.println("Length="+s1.length());

        System.out.println("Character at 1 index is: "+s1.charAt(1));

        System.out.println("index of character 'i': "+s1.indexOf('B'));

        System.out.println("index of character 'i' from last: "+s1.lastIndexOf('i'));

        System.out.println("Check for 'is' available in the String: "+s1.contains("is"));

        System.out.println("Lower casw string: "+s1.toLowerCase());

        System.out.println("upper case String: "+s1.toUpperCase());

        System.out.println("After applying trim: "+s1.trim());

        System.out.println("Substring from index 4: "+s1.substring(4));

        System.out.println("Substring from index 4 to 7: "+s1.substring(4,7));

        System.out.println("Replace 'is' with 'was': "+s1.replace("is","was"));
        ṇ
        
        String words[]=s1.split(" ");
        //System.out.println(words[0]);
        //System.out.println(words[1]); 
        //System.out.println(words[2]);

        for (int i=0; i<words.length; i++)
        {
            System.out.println(words[i]);
        }

        String s2="ram";
        String s3="hanuman";
        String s4="sita";
        System.out.println(s2.compare(s4));
    }
}