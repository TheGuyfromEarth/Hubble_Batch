public final class MyClass { // this class can not be inherited now

    int number;

    public MyClass(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyClass modify(int number) {
        if (this.number == number)
            return this;

        return new MyClass(number);
    }

    public static void main(String[] args) {
//        MyClass obj1 = new MyClass();
//        obj1.number = 20;
//        System.out.println(obj1.number);
//        obj1.setNumber(30);
//        System.out.println(obj1.number);\

        MyClass obj1 = new MyClass(20);
        System.out.println(obj1.number);
        obj1.modify(30);
        System.out.println(obj1.number);
    }
}
