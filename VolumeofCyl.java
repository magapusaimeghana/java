import java.util.Scanner;
class VolumeofCyl
{
    public static void main(String args[])
  {
        float rad,h,vol;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rad,h values:");
        rad=sc.nextFloat();
        h=sc.nextFloat();
        vol=(float)3.14*(rad*rad)*h;
        System.out.println("Volume of Cylinder="+vol);
        System.out.printf("Volume of Cylinder=%.0f",vol);
}
}