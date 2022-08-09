package Sorted;

import Arrays.BinarySearch;

import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        int[] array = {10,9,8,7,6,5,4,3,2,1};
        BubbleSorted.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
