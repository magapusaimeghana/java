interface Animal{
    void sound();
    void eat();
}
class Dog implements Animal{
    public void sound(){
       System.out.println("Dog makes sound like boww bowwwwww...."); 
    }
    public void eat(){
        System.out.println("Dog eats pedigri...");
    }
}
class Cow implements Animal{
    public void sound(){
        System.out.println("Cow makes sound like ambaaa....");
    }
    public void eat(){
        System.out.println("Cow eats grass");
    }
}
class Tiger implements Animal{
    public void sound(){
        System.out.println("Tiger roarsss ...");
    }
    public void eat(){
        System.out.println("Tiger eats meat....");
    }
}
public class Interface2 {
    public static void main(String[] args) {
        Animal parent;
        parent = new Dog();
        parent.sound();
        parent.eat();
        parent = new Cow();
        parent.sound();
        parent.eat();
        parent = new Tiger();
        parent.sound();
        parent.eat();
    }
    
}
