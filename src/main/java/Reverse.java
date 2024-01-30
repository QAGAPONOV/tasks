//Пeревернуть строку без использования методов типа reverse используя один массив.
//Пример: myReverse("12345"). Результат: "54321"

import java.sql.SQLOutput;
import java.util.Arrays;

public class Reverse {
    //    public static void main(String[] args) {
//        String line = "12345";
//        getReverseLine(line);
//    }
//
//    public static void getReverseLine(String sourceLine) {
//        char[] array = sourceLine.toCharArray();
//        for (int i = 0, j = (array.length - 1); i < array.length/2; i++, j--){
//            char variable = array[i];
//            array[i] = array[j];
//            array[j] = variable;
//        }
//        System.out.println(Arrays.toString(array));
//    }
//}
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




