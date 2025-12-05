class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    public void guard(){
        System.out.println("Dog protect our house");
    }
    @Override
    public void sound(){
        System.out.println("Dog makes sound like bow bow....");
    }
}
public class MethodOverridding {
    public static void main(String[] args) {
        Dog obj1=new Dog();
        obj1.eat();
        obj1.sound();
        obj1.guard();
    }

}
