package Homework5;

public class Main {

    private static Tea[] calculateRange() {
        Tea[] tea = new Tea[5];
        for (int i = 0; i < tea.length; ++i) {
            tea[i] = new Tea(5, 5, 5);
        }
        return tea;
    }

    private static ColorTea[] calculateRange1() {
        ColorTea[] tea1 = new ColorTea[5];
        for (int i = 0; i < tea1.length; ++i) {
            tea1[i] = new ColorTea(5, 5, 5,0);
        }
        return tea1;
    }

    private static HerbalTea [] calculateRange2 () {
        HerbalTea[] tea2 = new HerbalTea[5];
        for (int i =0; i < tea2.length;++i) {
            tea2 [i] = new HerbalTea(5,5,5,3);
        }
        return tea2;
    }


    public static void main(String[] args) {
        // Calculation
        double calculateRange = 0;
        double calculateRange1 = 0;
        double calculateRange2 =0;
        TeaCollection x1 = new TeaCollection ("green","India",5);
        x1.displayInfo();

        System.out.println ("Range Tea");

        for (Tea tea : calculateRange()) {
            calculateRange += tea.getRange();
        }
        System.out.println("Tea:"+ calculateRange);

        for (ColorTea tea1 : calculateRange1()) {
            calculateRange1 += tea1.getRange();
        }
        System.out.println("Color Tea:" + calculateRange1);

        for (HerbalTea tea2 : calculateRange2()) {
            calculateRange2 += tea2.getRange();
        }
        System.out.println("Herbal Tea:" + calculateRange2);


        TeaCollection x2 = new TeaCollection();
        x2.displayInfo1();

    }



}
