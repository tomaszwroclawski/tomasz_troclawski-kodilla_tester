package com.kodilla.collections.adv.immutble.special.homework;

import java.util.Objects;

public class Book{
    private String title;
    private String author;

    public Book (String title,String author){
        this.title=title;
        this.author = author;
    }
    public String getTitle(){
        return title;
    }

    public String getAuthor() {
        return author;
    }
    @Override
    public boolean equals(Object b){
        if(this ==  b) return true;
        if (b == null || getClass()!=b.getClass())return false;
        Book book = (Book) b;
        return Objects.equals(title,book.title)&& Objects.equals(author,book.author);
    }
    @Override
    public int hashCode(){
        return Objects.hash(title,author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

}
