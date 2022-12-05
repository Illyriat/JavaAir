import org.junit.Before;
import org.junit.Test;
import person.CabinCrew;
import person.Rank;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {
    CabinCrew cabinCrew;

    @Before
    public void before() {
        cabinCrew = new CabinCrew("Marylin", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void cabinCrewHasName() {
        assertEquals("Marylin", cabinCrew.getName());
    }

    @Test
    public void cabinCrewRank() {
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrew.getRank());
    }

    @Test
    public void makeAnnouncement() {
        assertEquals("Welcome aboard JavaAir. Enjoy your flight!", cabinCrew.talk());
    }
}
