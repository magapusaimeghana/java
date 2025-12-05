/*class Animal {
    public void eat(){
        System.out.println("Dog is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class S_Inheritnace2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  	// Output: Animal is eating
        dog.bark(); 	// Output: Dog is barking
    }
}*/

class Vehicle {
    public void start(){
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void drive(){
        System.out.println("Car is driving");
    }
}

public class S_Inheritnace2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();  // Output: Vehicle is starting
        car.drive();  // Output: Car is driving
    }
}

