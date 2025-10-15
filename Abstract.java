abstract class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
    public abstract void sound();
}
 class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Bow Bow...");
    }
}
class Tiger extends Animal{
    @Override
    public void sound(){
        System.out.println("Tiger is roaring");
    }
}
public class Abstract{
    public static void main(String[] args){
        Animal a;
        a=new Dog();
        a.eat();
        a.sound();

        a=new Tiger();
        a.eat();
        a.sound();
    }
}