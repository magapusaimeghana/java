public class Box {
    int l,b,h,area,vol;
    public Box(){
        l=b=h=1;
    }
    public Box(int n){
        l=b=h=n;
    }
    public Box(int p,int q,int r){
        l=p;
        b=q;
        h=r;
    }
    public void showdimension(){
        System.out.println(l+" "+b+" "+h);
    }
    public void calcarea(){
        area=2*(l*b+b*h+h*l);
    }
    public void calcVolume(){
        vol=l*b*h;
    }
    public static void main(String[] args) {
        Box b1=new Box();
        Box b2=new Box(4);
        Box b3=new Box(2, 3, 4);
        b1.calcarea();
        b1.calcVolume();
        b2.calcarea();
        b2.calcVolume();
        b3.calcarea();
        b3.calcVolume();
        b1.showdimension();
        System.out.println("Area = "+b1.area);
        System.out.println("Volume = "+b1.vol);
        b2.showdimension();
        System.out.println("Area = "+b2.area);
        System.out.println("Volume = "+b2.vol);
        b3.showdimension();
        System.out.println("Area = "+b3.area);
        System.out.println("Volume = "+b3.vol);
    }
}
