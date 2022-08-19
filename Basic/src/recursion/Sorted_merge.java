package recursion;

import java.util.Arrays;

/** Идея сортировки слиянием заключается в том, чтобы разделить массив пополам,
 отсортировать каждую половину, а затем воспользоваться методом merge() для
 слияния двух половин в один отсортированный массив.
 Рекурсия - В данном случае метод Sorted_merge вызывает сам себя до тех пор пока размер двух массивов не станет равным 1.
 После рекурсия начинает возвращать(Return) результат сортировки двух массивов по одному элементу ->
 Делает тоже самое для правой части массива и ->
 Этот результат использует для вызова который был произведён ранее и возвращает уже 2 массива по 2 отсортированных элемента
 и т.д Так доходя сначала до массивов по одному элементу рекурсия поднимаясь каждый раз на один вызов вверх, возвращает полный отсортированных массив
 P.S Рекурсивные методы используют результат который дан им нижним вызовом этого же метода
 */
public class Sorted_merge {
    public static int[] sortArray(int[] array) {
        if (array == null) {
            return null;
        }
        int length_arr = array.length / 2;

        if (array.length < 2) {
            return array;
        }
        if (array.length % 2 != 0){
            length_arr += 1;
        }
        int[] arrayR = new int[length_arr];
        int[] arrayL = new int[array.length / 2];
//        System.out.print("\n");
//        System.out.print("Left arr: ");j
        for (int i = 0; i < array.length / 2; i++) {
            arrayL[i] = array[i];
//            System.out.print(arrayL[i] + " ");
        }
//        System.out.print("\n");
//        System.out.print("Right arr: ");
        for (int i = array.length / 2; i < array.length; i++) {
            arrayR[i - array.length / 2] = array[i];
//                System.out.print(arrayR[i - array.length / 2] + " ");
        }
        arrayL = sortArray(arrayL);
        arrayR = sortArray(arrayR);

//        System.out.print("\n");
        return mergeArray(arrayL, arrayR);
    }


    private static int[] mergeArray(int[] arrayL, int[] arrayR) {

        int[] arrayC = new int[arrayL.length + arrayR.length];
        int posL = 0, posR = 0;

        for (int i = 0; i < arrayC.length; i++) {
            if (posL < arrayL.length && posR < arrayR.length) {
                if (arrayL[posL] < arrayR[posR]) {
                    arrayC[i] = arrayL[posL];
                    posL++;
                } else {
                    arrayC[i] = arrayR[posR];
                    posR++;
                }
            } else if (posL == arrayL.length && posR < arrayR.length) {
                arrayC[i] = arrayR[posR];
                posR++;
            }
            else if (posL < arrayL.length && posR == arrayR.length) {
                arrayC[i] = arrayL[posL];
                posL++;
            }else{
                arrayC[i] = 0;
            }
        }
        return arrayC;
    }
}