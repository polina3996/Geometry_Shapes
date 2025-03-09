package org.example;
import java.util.ArrayList;
import java.util.Random;

public class ShapeUtil {
    Random random = new Random();
    ArrayList<Shape> allShapes = new ArrayList<>();

    ArrayList<Shape> findEquals(ArrayList<Shape> allShapes, Shape shapeToCompare){
        ArrayList<Shape> equalShapes = new ArrayList<>();
        for (Shape shape: allShapes){
            if (shape.equals(shapeToCompare)){
                equalShapes.add(shape);
            }
        }
        return equalShapes;
    }


    public Circle createRandomCircle(){
        Circle circle =  new Circle(1 + random.nextDouble(10), "Random Circle");
        allShapes.add(circle);
        return circle;
    }

    public Square createRandomSquare(){
        Square square =  new Square(1 + random.nextDouble(10), "Random Square");
        allShapes.add(square);
        return square;
    }

    public Rectangle createRandomRectangle(){
        Rectangle rectangle = new Rectangle(1 + random.nextDouble(10), 1 + new Random().nextDouble(10), "Random Rectangle");
        allShapes.add(rectangle);
        return rectangle;
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
