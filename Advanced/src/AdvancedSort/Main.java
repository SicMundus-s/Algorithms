package AdvancedSort;

import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        int[] array = {5,3,10,7,9,11,1};
        QuickSort.sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
