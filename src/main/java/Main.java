// Написать метод, возвращающий количество чётных элементов
// массива.countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
public class Main {
    public static void main(String[] args) {
        int[] nums1 = {2,1,2,3,4}; // первая задача
        int[] nums2 = {2,2,0}; // первая задача
        int[] nums3 = {1,3,5}; // первая задача

        int[] numbers = {4,2,9,-7,5}; // вторая задача
        int difference = findDifference(numbers); // вторая задача

        int[] arr = {1,0,0,3,4}; // третья задача
        boolean result = zeroNeighbor(arr); // третья задача


        System.out.println(countEvens(nums1)); // первая задача
        System.out.println(countEvens(nums2)); // первая задача
        System.out.println(countEvens(nums3)); // первая задача
        System.out.println("Разница мужду самым большим и самым " +
                "маленьким элементыми: " + difference); // вторая задача
        System.out.println(result);
    }
    private static int countEvens(int[] nums) {
        int count = 0;
        for (int num : nums){
            if (num % 2 == 0){
                count++;
            }
        }
        return count;
    }

    //Написать функцию, возвращающую разницу между самым большим и
    //самым маленьким элементами переданного не пустого массива.

    public static int findDifference(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Пустой массив недопустим");
        }
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

//    Написать функцию, возвращающую истину, если в переданном
//    массиве есть два соседних элемента, с нулевым значением.

    public static boolean zeroNeighbor(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] == 0 && arr[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}

