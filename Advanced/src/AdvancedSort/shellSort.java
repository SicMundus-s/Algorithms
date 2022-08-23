package AdvancedSort;

public class shellSort {
    public static void sort(int[] array) {
            int inner, outer;
            int temp;
            int h = 1; // Вычисление исходного значения h
            while(h <= array.length/3)
                h = h*3 + 1; // (1, 4, 13, 40, 121, ...)
            while(h>0) // Последовательное уменьшение h до 1
            {
                // h-сортировка файла
                for(outer=h; outer< array.length; outer++)
                {
                    temp = array[outer];
                    inner = outer;
                    // Первый подмассив (0, 4, 8)
                    while(inner > h-1 && array[inner-h] >= temp)
                    {
                        array[inner] = array[inner-h];
                        inner -= h;
                    }
                    array[inner] = temp;
                }
                h = (h-1) / 3; // Уменьшение h
            }

        }
    }