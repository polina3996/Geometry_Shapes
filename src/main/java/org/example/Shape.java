package org.example;

public abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    public abstract boolean equals(Object o);

    abstract double squareCounter();

    abstract double perimeterCounter();

}
