package com.company;

public class Main {

    public static void main(String[] args) {
        Movie movie = new Movie("you like jazz?", "The Bee Movie", "Berry", 2007);
        movie.PrintInfo();
    }
}

class Movie {
    int year;
    String quote, title, character;

    Movie(String quote, String title, String character, int year) {
        this.quote = quote;
        this.title = title;
        this.character = character;
        this.year = year;
    }
    void PrintInfo() {
        System.out.println(String.format("\"%s\" by \"%s\" in \"%s\" released \"%d\"", this.quote, this.character, this.title, this.year));
    }
}
