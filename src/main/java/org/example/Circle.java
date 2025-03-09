package org.example;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius, String title){
        super(title);
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        else if (o == null || (getClass() != o.getClass())) {
            return false;
        }
        return ((this.radius == ((Circle) o).radius) &&
                (this.squareCounter() == ((Circle) o).squareCounter()) &&
                (this.perimeterCounter() == ((Circle) o).perimeterCounter()));
    }

    @Override
    public double squareCounter(){
        return Math.PI*Math.pow(this.radius, 2);
    }

    @Override
    public double perimeterCounter(){
        return 2*Math.PI*this.radius;
    }
}
