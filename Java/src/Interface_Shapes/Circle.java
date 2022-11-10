package Interface_Shapes;

public class Circle implements Shapes {
    public Circle(){
        radius = 0;
    }

    public Circle(double _radius){
        radius = _radius;
    }

    @Override
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    //private static double PI = 3.14; // No Magic Constants
    private final double PI = 3.14; // No Magic Constants

    private double radius;
}


