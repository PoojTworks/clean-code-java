package com.thoughtworks.movierental;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private int category;

    public Movie(String title, int category) {
        this.title = title;
        this.category = category;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int arg) {
        category = arg;
    }

    public String getTitle() {
        return title;
    }

}