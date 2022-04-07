// Inheritance (IS-A Relationship)
// Parent class/Super class
public class Vehicle {

    String vehicleType;
    int numTyres;

    public void move(){
        System.out.println("Parent class move method called");
    }
}

// Child class/Sub class/Derived Class
class Car extends Vehicle{

    String color;
    String engine;

    public void move(){
        System.out.println("Child class moves very fast method called");
    }

    public static void main(String[] args) {

        Car obj = new Car();
        obj.color = "White";
        obj.engine = "Four Stroke Engine";
        obj.numTyres = 5;
        obj.vehicleType = "fourWheeler";

        obj.move();
    }


}


class Fruit{

}

class Apple extends Fruit{

}