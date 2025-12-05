abstract class Shapedemo{
    String color;
    double area;
    public Shapedemo(String color){
        this.color=color;
    }
    public abstract void calculateArea();
    public void showArea(){
        System.out.println("Area = "+area);
    }
    public void showcolor(){
        System.out.println("Color is "+color);
    }
}
class Rectangle extends Shapedemo{
    double L,B;
    public Rectangle(String color,double L,double B){
        super(color);
        this.L=L;
        this.B=B;
    }
    @Override
    public void calculateArea(){
        area=L*B;
    }
}
class Circle extends Shapedemo{
    double radius;
    public Circle(String color,double radius){
        super(color);
        this.radius=radius;
    }
    @Override
    public void calculateArea(){
        area=3.142*radius*radius;
    }
}
public class Shape {
    public static void displayArea(Shapedemo s){
        if(s instanceof Rectangle){
            System.out.println("S holds the Rectangle instance Now");
        }
        else if(s instanceof Circle){
            System.out.println("S holds the Circle instance Now");
        }
        s.calculateArea();
        s.showcolor();
        s.showArea();
    }
    public static void main(String[] args) {
        /*Shapedemo s;
        s=new Rectangle("Red",25,34);
        s.calculateArea();
        s.showcolor();
        s.showArea();
        System.out.println("------------------------------");
        s=new Circle("Blue",23.5);
        s.calculateArea();
        s.showcolor();
        s.showArea();*/
        displayArea(new Rectangle("Red", 25, 24));
        displayArea(new Circle("Blue", 5));
    }
}
