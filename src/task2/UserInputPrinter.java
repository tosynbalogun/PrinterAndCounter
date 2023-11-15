package task2;

import java.util.Scanner;

public class UserInputPrinter {

    private Scanner scanner;

    public UserInputPrinter(Scanner scanner) {
        this.scanner = scanner;
    }

    public String printAndReturn(Scanner scanner) {
        String line = scanner.nextLine();
        System.out.println("Echo: >" + line);
        return line;
    }
}
