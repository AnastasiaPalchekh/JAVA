package Homework4;

import java.time.Year;

public class Education {
    public static void main(String[] args) {
       Book Cather = new Book ("The cather in the rie","Jerome David Salinger",
               "17.07.1957",270);
       Cather.displayInfo ();
    }
}
   class Book {
        String Name;
        String Author;
        String YearPublic;
        int pages;

        Book (String name, String author,String yearPublic,int pages)
        {
            Name = name;
            Author = author;
            YearPublic = yearPublic;
            this.pages = pages;

        }
        void displayInfo () {
            System.out.printf (
                    "Name: %s \nAuthor: %s \nYear of Publishing: %s \nPages: %s",
                    Name, Author,YearPublic,pages);
        }

   }




