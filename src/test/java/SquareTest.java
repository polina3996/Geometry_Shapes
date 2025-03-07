import org.example.Square;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {
    private Square square = new Square(3, "Square1");;

    @Test
    public void squareCounterTest(){
        //given
        //when
        double result = square.squareCounter();
        //then
        assertEquals(9, result, 0.1);

    }

    @Test
    public void perimeterCounterTest(){
        //given
        //when
        double result = square.perimeterCounter();
        //then
        assertEquals(12, result, 0.1);

    }
}