public class Student {

    // class members = class variables + class methods

    // class variables/attributes/features
    private String name;
    private int age;
    private String address;
    private double marksInPercent;

    // Constructor

    // parameterless Constructor or Default Constructor
    public Student(){
        System.out.println("Constructor called");
    }

    // Parametrized Constructor
    public Student(String nm, int ag, String ad, double marks){
        name = nm;
        age = ag;
        address = ad;
        marksInPercent = marks;
    }

    // class methods/behaviours
    public void display(){
        System.out.println("Name: "+name+" Age: "+age+" Address: "+address+" marksInPercent: "+marksInPercent);
    }

    // setter
    public void setAddress(String add){
        address = add;
    }

    public String getAddress(){
        return address;
    }

    public void setMarksInPercent(double marks){
        marksInPercent = marks;
    }

    public void setName(String nm){
        name = nm;
    }
}


// Further Learning
// 1) this keyword
// 2) static keyword
// 3) final keyword
// 4) Inheritance
// 5) super keyword

// Interface and Abstract class