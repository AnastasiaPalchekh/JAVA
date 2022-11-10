package Interface_Shapes;

public class Rhombus implements Shapes {

    private double diagonal1;

    private double diagonal2;

    public Rhombus ()
    {
        double diagonal1=0;
        double diagonal2=0;
    }

    public Rhombus (double diagonal1,double diagonal2)
    {
        this.diagonal1=diagonal1;
        this.diagonal2=diagonal2;
    }

    public void setDiagonal1 (double diagonal1) {this.diagonal1=diagonal1;}
    public void setDiagonal2 (double diagonal2) {this.diagonal2=diagonal2;}

    @Override
    public double getArea() {return  (diagonal1 * diagonal2)/2;}
}
