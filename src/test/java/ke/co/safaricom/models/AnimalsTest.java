package ke.co.safaricom.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalsTest {
    Animals testAnimals = new Animals(1,"LION",true,false);
    @Test
    void getId() { assertEquals(1, testAnimals.getId()); }

    @Test
    void getAnimal() { assertEquals("LION", testAnimals.getAnimal()); }

    @Test
    void getEndangered() { assertEquals(true, testAnimals.getEndangered()); }

    @Test
    void getDeleted() { assertEquals(false, testAnimals.getDeleted()); }
}