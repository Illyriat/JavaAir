import org.junit.Before;
import org.junit.Test;
import person.Person;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    
    Person person;
    private String name;

    @Before
    public void setUp() {
        person = new Person("James");
    }

    @Test
    public void canGetName() {
        assertEquals("James", person.getName());
    }

}
