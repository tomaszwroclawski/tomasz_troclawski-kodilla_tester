package com.kodilla.rest.domain;

import sun.tools.jconsole.inspector.XObject;

import java.util.Objects;

public class BookDto {
    private String title;
    private String author;

    public BookDto () {
    }

    public  BookDto (String title, String author) {
        this.title = title;
        this.author = author;
    }

        public String getAuthor() {
            return author;
        }

        public String getTitle () {
            return title;
        }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o== null || getClass() != o.getClass()) return false;
        BookDto bookDto =(BookDto) o;
       return Objects.equals(title, bookDto.title) &&
               Objects.equals(author, bookDto.author);
    }
    @Override
    public int hashCode(){
        return Objects.hash(title,author);
    }
}

