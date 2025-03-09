package org.example;

public class Square extends Shape{
    private double edge;

    public Square(double edge, String title){
        super(title);
        this.edge = edge;
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        else if (o == null || (getClass() != o.getClass())) {
            return false;
        }
        return ((this.edge == ((Square) o).edge) &&
                (this.squareCounter() == ((Square) o).squareCounter()) &&
                (this.perimeterCounter() == ((Square) o).perimeterCounter()));
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

