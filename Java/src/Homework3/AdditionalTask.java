package Homework3;

import java.util.Scanner;

public class AdditionalTask {
    private static void Menu () {
        String name = "";
        String lastname ="";
        String YB = "";
        
        while (true) {
                System.out.println("Enter number");
                int input = new Scanner(System.in).nextInt();
                if (input==0) {
                    break;
                }
                else{
                switch (input) {
                    case 1:
                        System.out.println("Enter name");
                        name = new Scanner(System.in).nextLine();
                        break;
                    case 2:
                        System.out.println("Enter Last Name");
                        lastname = new Scanner(System.in).nextLine();
                        break;
                    case 3:
                        System.out.println("Year of Birth");
                        YB = new Scanner(System.in).nextLine();
                        break;
                    case 4:
                        System.out.println("Information:");
                        System.out.printf("Name: %s \n", name);
                        System.out.printf("Last Name: %s \n", lastname);
                        System.out.printf("YB: %s \n", YB);
                        break;

                }
            }
            }
        }

    public static void main (String[] args) {
        Menu ();
    }


}
