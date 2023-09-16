package Classes;

public class CylinderClass {
    //properties
    public long radius;
    public long height;

    //behaviours
    public long lidArea()
    {
        return (long) (Math.PI*radius*radius);
    }
    public long perimeter()
    {
        return (long) (2*Math.PI*radius);
    }
    public long drumArea()
    {
        return 2*lidArea()+perimeter()*height;
    }
    public long volume()
    {
        return lidArea()*height;
    }

    public static void main(String[] args) {
        CylinderClass cylinder = new CylinderClass();
        cylinder.height = 7;
        cylinder.radius = 14;
        System.out.println(cylinder.lidArea());
        System.out.println(cylinder.volume());
        
    }
    
}