/*
3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов 
не равны, необходимо как-то оповестить пользователя. 
Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException.
 */

import java.util.Arrays;

public class Task_3 {
        public static void main(String[] args) {
        int[] arr1 = new int[]{4,5,6,7,8,5,9,10,12,15};
        int[] arr2 = new int[]{4,5,6,7,8,5,9,10,0,15};
        int[] arr3 = rezArray(arr1, arr2);

        System.out.println(Arrays.toString(arr3));
    }

    public static int[] rezArray(int[] array1, int[]array2) {
        if (array1.length!=array2.length){
            throw new RuntimeException("массивы не равны");
        }
        
        for (int i = 0; i < array2.length; i++){
            if (array2[i]==0){
                throw new RuntimeException("Во втором массиве есть элементы равные 0. На ноль делить нельзя.");
            }
        }

        int[] res = new int[array1.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = array1[i]/array2[i];
        }
        return res;
    }
}
