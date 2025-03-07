package org.example;

public class Rectangle extends Shape{
    private double edge1;
    private double edge2;

    public Rectangle(double edge1, double edge2, String title){
        super(title);
        this.edge1 = edge1;
        this.edge2 = edge2;

    }

    @Override
    public double squareCounter(){
        return this.edge1*this.edge2;
    }

    @Override
    public double perimeterCounter(){
        return (this.edge1+this.edge2)*2;
    }
}


