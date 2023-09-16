package Classes;

public class RectangleClass {
    //init properties
    public double length;
    public double breadth;

    // init behaviours
    public double area(){
        return length*breadth;
    }

    public double perimeter(){
        return 2*(length+breadth);
    }

    // main method
    public static void main(String[] args) {
        //create obj of Rectangle Class - 
        RectangleClass rectangleClass = new RectangleClass();
        rectangleClass.length = 10;
        rectangleClass.breadth = 20;
        System.out.println(rectangleClass.area());
        System.out.println(rectangleClass.perimeter());
    }


}
