import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("> ");
            String line = scanner.nextLine();
            if (line.equals("stop")) {
                break;
            }
            System.out.println("Echo:" + line);
        }
    }
}