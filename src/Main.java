import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowCount = 0;
        int characterCount = 0;
        while (true) {
            System.out.print("> ");
            String line = scanner.nextLine();
            if (line.equals("stop")) {
                break;
            }
            System.out.println("Echo:" + line);
            rowCount +=1;
            characterCount +=line.length();
        }
        System.out.println("Hello world!");
        System.out.println("Row count: " + rowCount);
        System.out.println("Character count: " + characterCount);
    }
}