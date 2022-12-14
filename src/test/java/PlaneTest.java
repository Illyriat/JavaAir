import org.junit.Before;
import org.junit.Test;
import plane.Plane;
import plane.PlaneType;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING737);
    }

    @Test
    public void planeHasType() {
        assertEquals(PlaneType.BOEING737, plane.getPlaneType());
    }

    @Test
    public void planeHasCapacity() {
        assertEquals(260, plane.getPlaneType().getCapacity());
    }

    @Test
    public void planeHasMaxWeight() {
        assertEquals(675000.50, plane.getPlaneType().getWeight(), 0.0);
    }

}
