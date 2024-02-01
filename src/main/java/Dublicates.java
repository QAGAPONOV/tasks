import java.util.*;

// Удалить дубликаты из сортированного списка с помощью коллекций.
// int[] sortedList = {1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10};

//public class Dublicates {
//    public static void main(String[] args) {
//
//        int[] sortedList = {1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10};
//        List<Integer> listDublicates = new ArrayList<>();
//        for (int value : sortedList) {
//            listDublicates.add(value);
//        }
//        List<Integer> listDublicat = new ArrayList<>();
//        for (Integer value : listDublicates) {
//            if (!listDublicat.contains(value)) {
//                listDublicat.add(value);
//            }
//        }
//        System.out.println(Arrays.toString(sortedList));
//        System.out.println(listDublicat);
//    }
//}


public class Dublicates {
    public static void main(String[] args) {
        List<Integer> listDublicates = new ArrayList<>();
//        listDublicates.add(1);
//        listDublicates.add(2);
//        listDublicates.add(2);
//        listDublicates.add(3);
//        listDublicates.add(4);
//        listDublicates.add(4);
//        listDublicates.add(4);
//        listDublicates.add(5);
//        listDublicates.add(6);
//        listDublicates.add(7);
//        listDublicates.add(8);
//        listDublicates.add(8);
//        listDublicates.add(9);
//        listDublicates.add(9);
//        listDublicates.add(10);
        int[] sortedList = {1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10};
        for (int i : sortedList) {
            listDublicates.add(i);
        }

        System.out.println("Список с повторяющимися значениями" + listDublicates);
        Set<Integer> setListOutDublicates = new HashSet<>(listDublicates);
        //List<Integer> listOutDublicates = new ArrayList<>(setListOutDublicates);
        System.out.println("Без повторяющихся значений" + setListOutDublicates);
    }
}

