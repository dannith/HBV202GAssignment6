package is.hi.hbv202g.ass6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarOwnerTest {

    public static final String JOHN_DOE = "John Doe";
    private Car car;
    private String johnDoe;

    @Before
    public void setUp() throws Exception {
        car = new Car("Beetle");
        johnDoe = JOHN_DOE;
    }

    @Test
    public void getName() {
        CarOwner carOwner = new CarOwner(johnDoe, car);
        assertEquals(johnDoe, carOwner.getName());
    }

}