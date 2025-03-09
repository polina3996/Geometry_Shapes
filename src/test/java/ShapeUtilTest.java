import org.example.Circle;
import org.example.ShapeUtil;
import org.example.Square;
import org.example.Rectangle;
import org.example.Shape;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeUtilTest{
    private ShapeUtil shapeUtil;
    private ArrayList<Shape> shapes;

    @BeforeEach
    void setUp(){
        shapeUtil = new ShapeUtil();
        shapes = new ArrayList<>();
        shapes.add(new Circle(4, "TestCircle"));
        shapes.add(new Square(1, "TestSquare"));
        shapes.add(new Rectangle(2, 3, "TestRectangle"));
    }

    @Test
    public void calculateAreaTest(){
       //when
        double result = shapeUtil.calculateArea(shapes);
        //then
        assertEquals(57.2654824, result, 0.01);
    }

    @Test
    public void calculatePerimeterTest(){
        //when
        double result = shapeUtil.calculatePerimeter(shapes);
        //then
        assertEquals(39.132741228, result, 0.01);
    }
}