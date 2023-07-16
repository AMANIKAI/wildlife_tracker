package ke.co.safaricom.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class SightingTest {

    Date testTime = new Date();

    Sighting testSighting = new Sighting(1, "Human",true,"Adult", "Sick", "NORTHEAST SECTION", "babayaro", testTime, false);

    @Test
    void getId() { assertEquals(1, testSighting.getId()); }

    @Test
    void getAnimal() { assertEquals("Human", testSighting.getAnimal());}

    @Test
    void getEndangered() { assertEquals(true, testSighting.getEndangered());}

    @Test
    void getAge() { assertEquals("Adult", testSighting.getAge());}

    @Test
    void getHealth() { assertEquals("Sick", testSighting.getHealth());}

    @Test
    void getLocation() {assertEquals("NORTHEAST SECTION", testSighting.getLocation());}

    @Test
    void getRanger() { assertEquals("babayaro", testSighting.getRanger()); }

    @Test
    void getTime() { assertEquals(testTime, testSighting.getTime());}

    @Test
    void getDeleted() { assertEquals(false, testSighting.getDeleted());}
}