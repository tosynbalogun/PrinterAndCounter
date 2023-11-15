package task2;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class UserInputPrinterTest {


    @Test
    public void testPass() {
        var scanner = new Scanner("Hello\nWorld\nstop");
        UserInputPrinter printer = new UserInputPrinter(scanner);
        assertEquals("Hello", printer.printAndReturn(scanner));
        assertEquals("World", printer.printAndReturn(scanner));
        assertEquals("stop", printer.printAndReturn(scanner));
    }

}