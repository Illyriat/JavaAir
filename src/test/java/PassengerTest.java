import org.junit.Before;
import org.junit.Test;
import person.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Simon", 3);
    }

    @Test
    public void passengerName() {
        assertEquals("Simon", passenger.getName());
    }

    @Test
    public void passengerHasBags() {
        assertEquals(3, passenger.passengerBagCount());
    }

}
