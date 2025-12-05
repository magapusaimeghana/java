class Father 
{ 
    String fname;
    int age;
    public Father(String fname,int age )
    {
        this.fname=fname;
        this.age=age;
    }
    public void displayinfo()
    {
          System.out.println("Father name: "+fname);
          System.out.println("Age: "+age);
    } 
}
class child extends Father
{
    String cname;
    int age;
    public child(String fname,int fage,String cname,int cage)
    {
        super(fname,fage);
        this.cname=cname;
        this.age=cage;
    }
    @Override
    public void displayinfo()
    {
        super.displayinfo();
        System.out.println("child name: "+cname);
        System.out.println("age: "+age);

    }
    public int agedifference(){
        return super.age-age;
    }
}
public class superdemo
{
    public static void main(String args[])
    {
        child obj=new child("Sreenivas",52,"Meghana",18);
        obj.displayinfo();
        System.out.println("Age difference = "+obj.agedifference());
    }
}