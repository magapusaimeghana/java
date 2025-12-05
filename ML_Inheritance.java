class A {
    void display() {
        System.out.println("A's method");
    }
}

class B extends A {
    void show()
	{
	  System.out.println("B's method");
	}
}
class C extends B
{
   void wish()
   {
      System.out.println("C's method");
   }
}

public class ML_Inheritance {
    public static void main(String[] args) {
        C obj=new C();
        obj.display();  // Output: A's method
		obj.show();		// Output: B's method
		obj.wish();		// Output: C's method
    }
}

/*class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
   void bark(){
    System.out.println("Dog is barking");
   }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

public class ML_Inheritance {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();   		// Output: Animal is eating
        puppy.bark();  		// Output: Dog is barking
        puppy.weep();  		// Output: Puppy is weeping
    }
}
*/
/* 
class Vehicle{
    public void start(){
        System.out.println("Vehicle is starting");
    }
    public void stop(){
        System.out.println("Vehicle is stopped");
    }
}
class car extends Vehicle{
    public void refuel(){
        System.out.println("Car is refilling with petrol");
    }
}
class Electricalcar extends car{
    public void charge()
    {
        System.out.println("Vehicle run with charging");
    }
    public class ML_Inheritance{
        Car waginor= new Car();
        Car.start();
        waginor.refuel();
        waginor.stop();

        Electricalcar tesla=new Electricalcar();
        tesla.start();
        tesla.refuel();
        tesla.stop();
    }
}*/