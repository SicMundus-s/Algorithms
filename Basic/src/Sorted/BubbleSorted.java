package Sorted;

public class BubbleSorted {

    /**
     * Сравниваем два значения в массиве между собой. Делаем свап если первоу значение больше.
     * Сортировка от меньшего к большему. Сложность O(N^2)
     * @param array Передаваемый массив
     */
    public static void sort(int[] array) {
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

}
