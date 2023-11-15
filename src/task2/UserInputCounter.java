package task2;

/**
 * This class counts the number of lines and words entered by the user.
 */
public class UserInputCounter {

    private int rowCount = 0;

    private int characterCount = 0;

    public UserInputCounter() {
        rowCount = 0;
        characterCount = 0;
    }

    public void count(String line) {
        if(line.equals("stop")) {
            return;
        }
        rowCount += 1;
        characterCount += line.length();
    }

    public int getRowCount() {
        return rowCount;
    }

    public int getCharacterCount() {
        return characterCount;
    }
}
