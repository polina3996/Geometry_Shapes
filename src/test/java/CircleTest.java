import org.example.Circle;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CircleTest {
    private Circle circle;

    @BeforeEach
    void setUp() {
        circle = new Circle(5, "Circle1");
    }

    @Test
    public void squareCounterTest(){
        //given
        //when
        double result = circle.squareCounter();
        //then
        assertEquals(78.5, result, 0.1);

    }

    @Test
    public void perimeterCounterTest(){
        //given
        //when
        double result = circle.perimeterCounter();
        //then
        assertEquals(31.4, result, 0.1);

    }
}
