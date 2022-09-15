package AdvancedSort;

public class QuickSort {

    /**
     *  Получен массив -> Рекурсивно разбиваем массив на диапазоны. В левый массив входят все числа меньше опорного.
     *  Вправый массив входят все числа больше опорного. Массив разбивается на диапазоны пока не достигнет одного элемента
     *  (Пока нечего будет разбивать). После рекурсивно начинают возвращаться вызовы разбивения массива с уже отсортированными значениями массива
     *  Процесс сортировки выполняется в момент разбиения массива на диапазоны.
     *  Эффективность быстрой сортировки - O(N*LogN)
     * @param array
     */
    public static void sort(int[] array, int from, int to) {
        if(from < to) {
            int opora = parttion(array, from, to);

            sort(array, from, opora - 1); // - 1 - (Не считая элемент находящиеся под индексом "opora" )

            sort(array, opora, to);
        }
    }

    private static int parttion(int[] array, int from, int to) {
        int leftIndex = from; // Переменная указывает на начало массива
        int rightIndex = to; // Переменная указывает на конец массива

        int pivot = array[from + (to - from) / 2]; // Опорным элементом выбираем середину массива.

        while (leftIndex <= rightIndex) {

            while (array[leftIndex] < pivot) { // Идём по левой части массива пока не найдём элемент больше pivot
                leftIndex++;
            }

            while (array[rightIndex] > pivot) { // Идём по правой части массива пока не найдём элемент меньше pivot
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(array, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
    private static void swap(int array[], int indexOne, int indexTwo) {
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }
}
