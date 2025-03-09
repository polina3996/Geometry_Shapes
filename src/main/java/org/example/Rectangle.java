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
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        else if (o == null || (getClass() != o.getClass())) {
            return false;
        }
        return ((this.edge1 == ((Rectangle) o).edge1) && (this.edge2 == ((Rectangle) o).edge2) &&
                (this.squareCounter() == ((Rectangle) o).squareCounter()) &&
                (this.perimeterCounter() == ((Rectangle) o).perimeterCounter()));
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


