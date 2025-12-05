class Animal{
    public void eat(){
        System.out.println("Animal is Eating");
    }
    public void sleep(){
        System.out.println("Animal is Sleeping");
    }
}
class Dog extends Animal{
    public void guard(){
        System.out.println("Dog is protecting our house");
    }
    public void makeSound(){
        System.out.println("Bow Bow..");
    }
    public void barking(){
        System.out.println("Dog is Barking");
    }
}
class Cat extends Animal{
    public void catchRat(){
        System.out.println("Dog will catch the rats");
    }
    public void makeSound(){
        System.out.println("Meow Meow..");
    }
}
class Tiger extends Animal{
    public void roar(){
        System.out.println("Tiger is roaring");
    }
    public void hunt(){
        System.out.println("Tiger is Hunting");
    }
}
public class H_Inheritance{
    public static void main(String[] args){
        System.out.println("Dog-----");
        Dog d=new Dog();
        d.eat();
        d.guard();
        d.makeSound();
        d.barking();
        d.sleep();

        System.out.println("cat----");
        Cat c=new Cat();
        c.catchRat();
        c.eat();
        c.makeSound();
        c.sleep();

        System.out.println("Tiger----");
        Tiger t= new Tiger();
        t.roar();
        t.hunt();
        t.eat();
        t.sleep();
    }
}