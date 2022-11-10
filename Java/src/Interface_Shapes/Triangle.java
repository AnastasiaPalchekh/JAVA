package Interface_Shapes;

public class Triangle implements Shapes {
    private double length;
    private double high;

    public Triangle ()
    {
        high=0;
        length=0;
    }

    public Triangle (double length, double high)
    {
        this.length = length;
        this.high = high;
    }

    public void setHigh (double high) {this.high=high;}
    public void setLength (double length) {this.length=length;}

    @Override
    public double getArea() {return  (length * high)/2;}
}
