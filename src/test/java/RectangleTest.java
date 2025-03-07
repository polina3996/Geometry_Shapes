import org.example.Rectangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    private Rectangle rectangle = new Rectangle(3, 2, "Rectangle1");;

    @Test
    public void squareCounterTest(){
        //given
        //when
        double result = rectangle.squareCounter();
        //then
        assertEquals(6, result, 0.1);

    }

    @Test
    public void perimeterCounterTest(){
        //given
        //when
        double result = rectangle.perimeterCounter();
        //then
        assertEquals(10, result, 0.1);

    }
}