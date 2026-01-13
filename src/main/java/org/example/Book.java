package org.example;

public class Book extends LibraryItem{
    int pageCount;

    public Book(String title, String author, int year, int pageCount){
        super(title,author,year);
        this.pageCount=pageCount;
    }

    public int getPageCount(){
        return pageCount;
    }

    public void setPageCount(int pageCount){
        this.pageCount=pageCount;
    }

    public String readBook(){
        return title;
    }

    public String toString(){
        return "Book: "+title+" by "+author+ " ("+ year+ ")" +" - "+pageCount+ " pages";
    }
}

