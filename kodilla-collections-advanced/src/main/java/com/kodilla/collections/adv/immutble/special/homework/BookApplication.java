package com.kodilla.collections.adv.immutble.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();

        Book book1 = bookManager.createBook("Stary okręt płonie","Mary Mood");
        Book book2 = bookManager.createBook("Rowerem po Polsce","Pascal Escapade");
        Book book3 = bookManager.createBook("Stary okręt płonie","Mary Mood");
        Book book4 = bookManager.createBook("Rowerem po Polsce","Pascal Escapade");
        Book book5 = bookManager.createBook("Siedem życzeń konia","Mark Magnussen");

        if(book1==book3){
            System.out.println("I have got this titel of book "+ book1);
        }else {
            System.out.println("I did not this titel of book " + book1);
        }

        if (book1.equals(book3)){
            System.out.println("I have got this book titel "+ book1);
        }
        else
            {
            System.out.println("I did not this book titel " + book1);
        }

    }

}
