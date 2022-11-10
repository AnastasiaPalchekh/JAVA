package Homework5;

public class ColorTea extends Tea {

    int color;

    public ColorTea ()
    {
        aroma = 0;
        astrigency =0;
        flavor=0;
        color=0;
    }

    public ColorTea (double aroma, double astrigency, double flavor,int color)
    {
        this.aroma=aroma;
        this.astrigency=astrigency;
        this.flavor=flavor;
        this.color=color;
    }
    public void setAroma (double aroma) {this.aroma=aroma;}
    public void setAstrigency(double astrigency) {this.astrigency=astrigency;}
    public void setFlavor (double flavor) {this.flavor=flavor;}
    public void setColor (int color) {this.color=color;}

    public double getRange ()
    {
        return ((aroma*astrigency*flavor*(color/0.8))/0.2);
    }

}
