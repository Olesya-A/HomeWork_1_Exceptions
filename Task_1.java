/*
1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
*/

public class Task_1 {
    public static void main(String[] args) {
        
        // 1 метод
        //System.out.println(division(10, 0));

        // 2 метод
        //int[] arr = new int[]{1,2,3,4,5};
        //findIndex(arr, 5);

        // 3 метод
        //wrongFormat(Integer.parseInt("string"));

        // 4 метод
        //String[] strArr = {"first", null, "third"};
        //notNull(strArr);
        
    }

    public static int division(int a1, int a2) {
        if (a2 == 0) {
            throw new ArithmeticException("На ноль делить нельзя.");
        }
        return a1/a2;
    }

    public static void findIndex(int[] arr, int index) {
        if (index > arr.length-1) {
            throw new ArrayIndexOutOfBoundsException("Такого индекса нет в массиве.");
        }
        System.out.println(arr[index]);
    }

    public static void wrongFormat(int num) {
        System.out.println(num);
        
    }

    public static void notNull(String[] strArr) {
        for (String item: strArr){
            if(item == null){ 
                throw new NullPointerException("Элемент отсутствует.");
            }
            System.out.println(item);
        }
    }

}