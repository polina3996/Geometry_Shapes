package org.example;

public class Square extends Shape{
    private double edge;

    public Square(double edge, String title){
        super(title);
        this.edge = edge;
    }


    @Override
    public double squareCounter(){
        return Math.pow(this.edge, 2);
    }

    @Override
    public double perimeterCounter(){
        return 4*this.edge;
    }
}

