import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineCount = 0;
        int wordCount = 0;
        while (true) {
            System.out.print("> ");
            String line = scanner.nextLine();
            if (line.equals("stop")) {
                break;
            }
            System.out.println("Echo:" + line);
            lineCount +=1;
            wordCount +=line.length();
        }
        System.out.println("Hello world!");
        System.out.println("Line count: " + lineCount);
        System.out.println("Word count: " + wordCount);
    }
}