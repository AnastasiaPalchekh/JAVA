package Homework5;

import java.util.Scanner;

public class TeaCollection {
    String Color;
    String Country;
    int Range;

    public TeaCollection ()
    {
        Color= "";
        Country = "";
        Range =0;
    }
    public TeaCollection(String Color, String Country, int Range) {
        this.Color = Color;
        this.Country = Country;
        this.Range = Range;
    }

    void displayInfo() {
        System.out.printf("Color: %s \nCountry: %s \nRange: %s \n",
                Color, Country, Range);
    }

    static void displayInfo1() {

        while (true) {
            System.out.print("Please enter your range: ");
            int range = new Scanner(System.in).nextInt();

            if (range > 0 && range <= 20) {
                if (range > 0 && range <= 10)
                    System.out.println("Your tea is green ");
                if (range >= 11 && range <= 20) {
                    System.out.println("Your tea is black ");
                }
                if (range>20) {
                    System.out.println("Your tea is red");
            }
            } else {
                System.out.println("Sorry, you’ve written not correct range");
            }


        }
    }
}


