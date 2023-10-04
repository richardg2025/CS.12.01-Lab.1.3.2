import java.util.ArrayList;
public class Sort {
    public static int[] bubbleSort(int[] array) {
        boolean swapped = true;
        while(swapped) {
            swapped = false;
            for(int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapped = true;
                }
            }
        }
        return array;
    }

    public static String[] bubbleSort(String[] array) {
        boolean swapped = true;
        while(swapped) {
            swapped = false;
            for(int i = 0; i < array.length - 1; i++) {
                if(array[i].compareToIgnoreCase(array[i+1]) > 0) {
                    String temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapped = true;
                }
            }
        }
        return array;
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {
        boolean swapped = true;
        while(swapped) {
            swapped = false;
            for(int i = 0; i < list.size() - 1; i++) {
                if(list.get(i) > list.get(i+1)) {
                    int temp = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, temp);
                    swapped = true;
                }
            }
        }
        return list;
    }

    public static int[] selectionSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int minIndex = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[minIndex] > array[j]) minIndex = j;
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }

    public static String[] selectionSort(String[] array) {
        for(int i = 0; i < array.length; i++) {
            int minIndex = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[minIndex].compareToIgnoreCase(array[j]) > 0) minIndex = j;
            }
            String temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }

    public static ArrayList<String> selectionSort(ArrayList<String> list) {
        for(int i = 0; i < list.size(); i++) {
            int minIndex = i;
            for(int j = i + 1; j < list.size(); j++) {
                if(list.get(minIndex).compareToIgnoreCase(list.get(j)) > 0) minIndex = j;
            }
            String temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
        return list;
    }
}