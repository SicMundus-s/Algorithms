package Arrays;

public class BinarySearch {

    /**
     * Работает только с отсортированным массивом.
     * Поиск начинается с центрального элемента -> Если элемент совпадает, то возвращаем значение этого элемента. Иначе
     * Смотрим наш элемент меньше или больше центрального? В зависимости от этого "отнимаем" либо левую часть массива, либо правую
     * Таким образом сокращаем сразу половину значений. Сложность алгоритма O(log N) - где N кол-во элементов
     */
    public static int Search(int[] a, int key) {

        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if(a[mid] < a[key]) { // Если центральное значение меньше искомого, то мы как бы отсекаем левую часть массива
                low = mid + 1;
            } else if(a[mid] > a[key]) { // Если больше, то правую
                high = mid - 1;
            } else {
                return a[mid]; // Ключ найден. Возвращаем значение
            }
        }
        return -1; // Значение не найдено
    }
}
