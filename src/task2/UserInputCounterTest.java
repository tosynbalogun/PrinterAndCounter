package task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserInputCounterTest {

    @Test
    public void testShouldPass() {
        UserInputCounter counter = new UserInputCounter();
        counter.count("Hello");
        counter.count("World");
        counter.count("stop");
        assertEquals(2, counter.getRowCount());
        assertEquals(10, counter.getCharacterCount());
    }

    @Test
    public void testShouldReturn0IfStopped() {
        UserInputCounter counter = new UserInputCounter();
        counter.count("stop");
        assertEquals(0, counter.getRowCount());
        assertEquals(0, counter.getCharacterCount());
    }

}