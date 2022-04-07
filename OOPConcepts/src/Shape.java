public class Shape {

    private double side = 10;

    // area of square
    public int area(int side){
        System.out.println("Int method called");
        return side*side;
    }

    // area of a circle
    public double area(double radius){
        System.out.println("Double method called");
        return Math.PI*radius*radius;
    }
}
