package org.example;
import java.util.ArrayList;
import java.util.Random;

public class ShapeUtil {
    Random random = new Random();

    public Circle createRandomCircle(){
        return new Circle(1 + random.nextDouble(10), "Random Circle");
    }

    public Square createRandomSquare(){
        return new Square(1 + random.nextDouble(10), "Random Square");
    }

    public Rectangle createRandomRectangle(){
        return new Rectangle(1 + random.nextDouble(10), 1 + new Random().nextDouble(10), "Random Rectangle");
    }

    public void createRandomShape(){
        int number = 1 + random.nextInt(3);
        if (number==1){
            createRandomCircle();
        }
        else if (number==2){
            createRandomSquare();
        }
        else{
            createRandomRectangle();
        }
    }

    public double calculateArea(ArrayList<Shape> shapes){
        double commonSquare = 0;
        for (Shape shape: shapes){
            commonSquare += shape.squareCounter();
        }
        return commonSquare;
    }

    public double calculatePerimeter(ArrayList<Shape> shapes){
        double commonPerimeter = 0;
        for (Shape shape: shapes){
            commonPerimeter += shape.perimeterCounter();
        }
        return commonPerimeter;
    }

    public double calculateArea(Shape shape) {
        return shape.squareCounter();
    }

    public double calculatePerimeter(Shape shape) {
        return shape.perimeterCounter();
    }
}
