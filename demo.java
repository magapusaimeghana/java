
public class demo{
    int x;
	public demo()
	{
	   x=10;
	}
	public demo(int x)
	{
	   this.x=x;
	}
	public static void main(String args[])
	{
	   demo t1=new demo();
	   demo t2=new demo(20);
	   System.out.println(t1.x);
	   System.out.println(t2.x);
	}
}
