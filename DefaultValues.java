public class DefaultValues {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char ch;
    boolean bool;
    public static void main(String[] args) {
        DefaultValues obj=new DefaultValues();
        System.out.println("byte default value ="+obj.b);
        System.out.println("short default value ="+obj.s);
        System.out.println("int default value ="+obj.i);
        System.out.println("long default value ="+obj.l);
        System.out.println("float default value ="+obj.f);
        System.out.println("double default value ="+obj.d);
        System.out.println("char default value ="+obj.ch);
        System.out.println("boolean default value ="+obj.bool);
    }
}
