package Homework5;

import java.util.Scanner;

public class HerbalTea extends Tea {
    double NaturalAdd;

    public HerbalTea ()
    {
        aroma = 0;
        astrigency =0;
        flavor=0;
        NaturalAdd=0;
    }

    public HerbalTea(double aroma, double astrigency, double flavor,double NaturalAdd)
    {
        this.aroma=aroma;
        this.astrigency=astrigency;
        this.flavor=flavor;
        this.NaturalAdd=NaturalAdd;
    }
    public void setAroma (double aroma) {this.aroma=aroma;}
    public void setAstrigency(double astrigency) {this.astrigency=astrigency;}
    public void setFlavor (double flavor) {this.flavor=flavor;}
    public void setNaturalAdd (double NaturalAdd) {this.NaturalAdd=NaturalAdd;}

    public double getRange ()
    {
        return ((aroma*astrigency*flavor*(NaturalAdd/0.7))/0.2);
    }


}

