import java.util.Scanner;
class centroid
{
    public static void main(String args[])
  {
        float x1,x2,x3,y1,y2,y3,C,D;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x1,x2,x3,y1,y2,y3 values:");
        x1=sc.nextFloat();
        x2=sc.nextFloat();
        x3=sc.nextFloat();
        y1=sc.nextFloat();
        y2=sc.nextFloat();
        y3=sc.nextFloat();
      C=(x1+x2+x3)/3;
      D=(y1+y2+y3)/3;

        System.out.println("centroid of Triangle is=("+C+","+D+")");
        System.out.printf("centroid of Triangle=(%.2f,%.2f)",C,D);
}
}