package task2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserInputCounter counter = new UserInputCounter();
        UserInputPrinter printer = new UserInputPrinter(scanner);

        while (scanner.hasNext()) {
            System.out.print("> ");
            var userInput = printer.printAndReturn(scanner);
            counter.count(userInput);
            if(userInput.equals("stop")) {
                break;
            }
        }
        System.out.println("Row Count = " + counter.getRowCount());
        System.out.println("Character Count = " + counter.getCharacterCount());
    }
}
