package org.example;
import java.util.Random;

public class ShapeUtil {
    Random random = new Random();

    Circle createRandomCircle(){
        return new Circle(1 + random.nextDouble(10), "Random Circle");
    }

    Square createRandomSquare(){
        return new Square(1 + random.nextDouble(10), "Random Square");
    }

    Rectangle createRandomRectangle(){
        return new Rectangle(1 + random.nextDouble(10), 1 + new Random().nextDouble(10), "Random Rectangle");
    }

    void createRandomShape(){
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
}
