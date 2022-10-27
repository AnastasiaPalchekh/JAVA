package Homework3;

import java.util.Scanner;

public class Cycle {
     static void InfinityLoop () {
         String str = new String();
         Scanner scanner = new Scanner(System.in);
         while (true) {
             System.out.print(str);
             str = scanner.nextLine();
             if (str.equals("exit") ) {
                 break;
             }
         }
     }

    static void NegativeNumber (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i >= x; i--) {
            sum = sum + i;
        }
        System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum);
    }
    static void IncorrectValue () {

       // for (int i=0; i<2; i++){
        while (true){
            System.out.print("Please enter your score: ");
            int score = new Scanner(System.in).nextInt();
            /*if (score==999){
                break;
            }  // условие выхода
             */
            if (score >= 0 && score <= 100) {
                if (score >= 70) {
                    System.out.println("Congrats! You’ve passed the test!");
                } else {
                    System.out.println("Sorry, you’ve failed the test.");
                }

            } else {
                System.out.println("Incorrect value! Enter again");

            }

        }

    }
    static void TVSET () {
        System.out.println("Введите номер программы:");
        String [] channels = new String[] {"Такой программы нет","1","2","3","4","5"};
        int i = new Scanner(System.in).nextInt();
        while (true){
            if (i==0) {
                System.out.println(channels[i]);
                break;
            }
        else {
            System.out.println("Открывается программа:" + channels[i]);
               i= new Scanner (System.in).nextInt();
            }
        }

    }
    public static void main(String[] args) {
        InfinityLoop();
        NegativeNumber();
        IncorrectValue();
        TVSET();
    }
}

