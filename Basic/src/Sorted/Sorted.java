package Sorted;

public class Sorted {

    /**
     * Сравниваем два значения в массиве между собой. Делаем свап если первоу значение больше.
     * Сортировка от меньшего к большему. Сложность O(N^2)
     * @param array Передаваемый массив
     */
    public static void bubbleSort(int[] array) {
        int temp;
        boolean swappedSomething = true;

        while (swappedSomething) {
            swappedSomething = false;

            for (int i = 0; i < array.length - 1; i++)
                if (array[i] > array[i + 1]) {
                    swappedSomething = true;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
        }
    }

    /**
     * Сортировка методом выбора, помещаем минимальный элемент из массива в перемменую min. Сравниваем следующий
     * элемент с min и если он меньше то перемещаем его на место предыдущего минимального элемента. Сложность O(N^2) но
     * данный вид сортировки выполняется быстрее за счёт меньшего кол-во переставлений чем в пузырьковой сортировки.
     * @param nums Переданный массива
     */
    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            // min is the index of the smallest element with an index greater or equal to i
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            // Swapping i-th and min-th elements
            int swap = nums[i];
            nums[i] = nums[min];
            nums[min] = swap;
        }
    }

}
