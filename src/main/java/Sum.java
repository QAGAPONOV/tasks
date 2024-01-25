//Реализовать метод, который будет возвращать количество передаваемого символа в слове.
// Пример: countCharAtWord('a', \"Alligator\") = 2

public class Sum {
    public static void main(String[] args) {
        char countChar = 'a';
        String atWord = "Alligator";

        int count = countChatAtWord(countChar, atWord);
        System.out.println(("Символов '" + countChar + "' в '" + atWord + "': " + count));
    }
    public static int countChatAtWord(char countChar, String atWord) {
        int count = 0;
        for (int i = 0; i < atWord.length(); i++) {
            if (Character.toLowerCase(atWord.charAt(i)) == Character.toLowerCase(countChar)) {
                count++;
            }
        }
        return count;
    }
}
