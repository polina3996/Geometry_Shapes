package org.example;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius, String title){
        super(title);
        this.radius = radius;
    }


    @Override
    public double squareCounter(){
        return Math.PI*Math.pow(this.radius, 2);
    }

    @Override
    public double squarePerimeter(){
        return 2*Math.PI*this.radius;
    }
}
