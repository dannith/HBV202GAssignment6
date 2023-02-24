package is.hi.hbv202g.ass6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    public static final String BEETLE = "Beetle";
    private String beetle;

    @Before
    public void setUp(){
        beetle = BEETLE;
    }

    @Test
    public void getNameOfCar() {
        Car car=new Car(beetle);
        assertEquals(beetle, car.getName());
    }

}
