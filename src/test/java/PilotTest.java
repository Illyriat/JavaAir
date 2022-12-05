import org.junit.Before;
import org.junit.Test;
import person.Pilot;
import person.Rank;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("George", Rank.ENGINEER, 873974);
    }

    @Test
    public void pilotName() {
       assertEquals("George", pilot.getName());
    }

    @Test
    public void pilotRank() {
        assertEquals(Rank.ENGINEER, pilot.getRank());
    }

    @Test
    public void pilotLicence() {
        assertEquals(873974, pilot.getLicenceNumber());
    }

    @Test
    public void pilotFlyingPlane() {
        assertEquals("JavaAir Flight 243 preparing for take off.", pilot.flyPlane());
    }


}
