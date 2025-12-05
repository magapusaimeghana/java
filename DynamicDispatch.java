class Animal{
    public void eat(){
        System.out.println("Animal is Eating");
    }
    public void sound(){
        System.out.println("Animal makes sound");
    }
    public void guard(){
        System.out.println("Dog guards our house");
    }
}
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Bow Bow...");
    }
    public void guard(){
        System.out.println("Dog guards our house");
    }
}
class Tiger extends Animal{
    @Override
    public void sound(){
        System.out.println("Tiger is Roaring");
    }
}
public class DynamicDispatch {
    public static void main(String[] args){
        Animal a = new Animal();
        a.eat();
        a.sound();
        a.guard();

        Dog d = new Dog();
        d.eat();
        d.sound();

        Tiger t = new Tiger();
        t.eat();
        t.sound();

        System.out.println("====================");

        /*Dynamic Dispatching */

        a=new Dog();
        a.eat();
        a.sound();
        a.guard();

        a=new Tiger();
        a.eat();
        a.sound();
    }
}