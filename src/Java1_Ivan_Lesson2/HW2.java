package Java1_Ivan_Lesson2;

import java.util.Arrays;

public class HW2 {

    public static void main(String[] args) {
        int n = 15;
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(replace(arr)));
        int[] arr1 = new int[8];
//        plusThree(arr1);
        System.out.println(Arrays.toString(plusThree1(arr1)));
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(more6Multiply2(arr2)));
        int[] arr4 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(minElement(arr4));
        System.out.println(maxElement(arr4));
        int[][] arr3 = new int[n][n];
        System.out.println(Arrays.deepToString(diagonal(arr3)));

        int[] arr5 = {-1, 5, 3, 2, 11, 4, 5, 2, 4, 5, 9, -1};
        System.out.println(checkBalance(arr5));
        System.out.println(checkBalance1(arr5));
        System.out.println("TEST GIT");
        int[] arr6 = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(replaceElement(arr6, -4)));
    }

    public static int[] replaceElement(int[] arr, int elemenChange) {
        if (elemenChange>arr.length){
            elemenChange = elemenChange%arr.length;
        }
        int  change = (arr.length - elemenChange) % arr.length;

        int[] arr1 = Arrays.copyOfRange(arr, change, arr.length);
        int[] arr2 = Arrays.copyOfRange(arr, 0, change);
        int[] arr3 = new int[arr.length];
        for (int i = 0; i < arr3.length; i++) {
            if (i < (arr.length - change)) {
                arr3[i] = arr1[i];
            } else {
                for (int j = 0; j < change; j++) {
                    arr3[i] = arr2[j];
                    i++;
                }
            }
        }
        return arr3;
    }

    public static int[] replace(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - arr[i];
        }
        return arr;
    }

    public static void plusThree(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sum;
            sum += 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] plusThree1(int[] arr) {
        int sum = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sum;
            sum += 3;
        }
        return arr;
    }

    public static int[] more6Multiply2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        return arr;
    }

    public static int[][] diagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || (i + j) == arr.length - 1) {
                    arr[i][j] = 1;
                } else arr[i][j] = 0;
            }
        }
        return arr;
    }

    public static int minElement(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxElement(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static boolean checkBalance(int[] arr) {
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                sum1 += arr[i];
                sum -= arr[i];
                if (sum == sum1) {
                    return true;
                }
            }

        }
        return false;
    }

    public static boolean checkBalance1(int[] arr) {
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sum1 += arr[j];
            }
            if (sum == sum1) {
                return true;
            }
            sum1 = 0;
        }
        return false;
    }

//    public static int[] replaceElement(int[] arr, int elemenChange) {
//        int change = (arr.length + 1 + elemenChange) % (arr.length + 1);
//        int a = arr[arr.length - 1];
//        for (int i = 0; i < change; i++) {
////            for (int j = arr.length; j > 0; j--) {
////                arr[arr.length - j + 1] = arr[arr.length - j];
////            }
//            for (int j = 0; j <arr.length ; j++) {
//
//            }
//            arr[0] = a;
//        }
//        return arr;
//    }
}
