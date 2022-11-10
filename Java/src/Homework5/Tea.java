package Homework5;

public class Tea {

    double aroma;

    double astrigency;

    double flavor;

    public Tea() {
        aroma = 0;
        astrigency = 0;
        flavor = 0;
    }

    public Tea(double aroma, double astrigency, double flavor) {
        this.aroma = aroma;
        this.astrigency = astrigency;
        this.flavor = flavor;
    }

    public void setAroma(double aroma) {
        this.aroma = aroma;
    }

    public void setAstrigency(double astrigency) {
        this.astrigency = astrigency;
    }

    public void setFlavor(double flavor) {
        this.flavor = flavor;
    }

    public double getRange() {
        return ((aroma * astrigency * flavor) / 0.2);
    }
}
