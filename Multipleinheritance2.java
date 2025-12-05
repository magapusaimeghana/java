interface flyable{
    void fly();
}
interface swimmable{
    void swim();
}
interface runnable{
    void run();
}
class Bird implements flyable,runnable{
    public void fly(){
        System.out.println("Birds can fly");
    }
    public void run(){
        System.out.println("Birds can run");
    }
}
class Fish implements swimmable{
    public void swim(){
        System.out.println("Fish can swim");
    }
}
class Dog implements runnable,swimmable{
    public void run(){
        System.out.println("Dog can run");
    }
    public void swim(){
        System.out.println("Dog can swim");
    }
}
public class Multipleinheritance2 {
    public static void main(String[] args) {
        Bird b=new Bird();
        b.fly();
        b.run();
        Dog d=new Dog();
        d.swim();
        d.run();
        Fish f=new Fish();
        f.swim();
    }
}
