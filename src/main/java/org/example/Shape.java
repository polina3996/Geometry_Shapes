package org.example;

public abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double squareCounter();

    abstract double perimeterCounter();
}
