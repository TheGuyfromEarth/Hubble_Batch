public class Driver {

    public static void main(String[] args) {
        Student person1 = new Student("Mark", 20, "India", 98.5); // creates an object

        person1.setAddress("USA");

//        person1.display();

        Student person2 = new Student("Lisa",18,"NZ",99.2);
//        person2.name = "Lisa";
//        person2.age = 18;
//        person2.address = "NZ";
//        person2.marksInPercent = 99.2;


//        person2.marksInPercent = 9.2;

        person2.setMarksInPercent(9.2);

        System.out.println(person2.getAddress());
        person2.display();

//        System.out.println(person2.name);
    }
}


// Features of OOP
// 1) Abstraction
// 2) Encapsulation
// 3) Polymorphism
//          a) Static Polymorphism (Method Overloading) (Compile Time Polymorphism)
//          b) Dynamic Polymorphism (Method Overriding) (Runtime Polymorphism)
// 4) Inheritance (Reusability)