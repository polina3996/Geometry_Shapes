import org.example.Rectangle;
import org.example.Square;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SquareTest {
    private Square square;

    @BeforeEach
    void setUp() {
        square = new Square(3, "Square1");
    }

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