import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Удалить дубликаты из сортированного списка с помощью коллекций.
// int[] sortedList = {1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10};

public class Dublicates {
    public static void main(String[] args) {

        int[] sortedList = {1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10};
        List<Integer> listDublicates = new ArrayList<>();
        for (int value : sortedList) {
            listDublicates.add(value);
        }
        List<Integer> listDublicat = new ArrayList<>();
        for (Integer value : listDublicates) {
            if (!listDublicat.contains(value)) {
                listDublicat.add(value);
            }
        }
        System.out.println(Arrays.toString(sortedList));
        System.out.println(listDublicat);
    }
}
