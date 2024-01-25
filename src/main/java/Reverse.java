//Пeревернуть строку без использования методов типа reverse используя один массив.
//Пример: myReverse("12345"). Результат: "54321"

public class Reverse {
    public static void main(String[] args) {
        String myReverse = "12345";
        char[] charArray = myReverse.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        String revers = new String(charArray);
        System.out.println(myReverse);
        System.out.println(revers);
    }
}
