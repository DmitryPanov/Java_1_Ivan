package Java1_Ivan_Lesson3_TicTacToe;

import java.util.Arrays;

public class NewExercises {
    public static void main(String[] args) {
        int m = 12;
        int[] A = {10, -12, 33, 4, -5, -6, -17, -8, -9, -10, -11, 12};
        int[] B = {11, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 10};
        int[] C = new int[m];
//
//        System.out.println(Arrays.toString(A));
//        System.out.println(Arrays.toString(B));
//        System.out.println(Arrays.toString(C));
//        doNewArrayC(A, B, C);
//        System.out.println(Arrays.toString(C));
//        System.out.println(sumArrayC(C));
        lessLastElement(C);
        lastToBegin(A);
        positiveElements(A);


    }


    public static int[] doNewArrayC(int[] a, int[] b, int[] c) {
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] + b[c.length - 1 - i];
        }
        return c;
    }

    public static int sumArrayC(int[] c) {
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum += c[i];
        }
        return sum;
    }

    public static void lessLastElement(int[] c) {
        int count = 0;
        System.out.println("Value to Compare With " + c[c.length - 1]);
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] < c[c.length - 1]) {
                System.out.println("Element " + i + " Value:" + c[i] + " ");
                count++;
            }
        }
        System.out.println("All Element: " + count);
    }

    public static void lastToBegin(int[] a) {
        int sum = 0;
        int[] arr = new int[a.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a[a.length - 1 - i];
            sum += arr[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
    }

    public static void positiveElements(int[] a) {
        int min1 = a[0];
        int countPositive = 0;
        int countNegative = 0;
        int number = 0;
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] < 0) {
//                arr[i] = 0;
//            } else arr[i] = a[i];
//            sum += arr[i];
//        }
//        System.out.println("Sum Array: " + sum);
//        System.out.println(Arrays.toString(arr));
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
//                countPositive++;
//                if (arr[i] < min1) {
//                    min1 = arr[i];
//                    number = i;
//                }
//            }

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                countPositive++;
                if (min1 <= 0) {
                    min1 = a[i];
                    number = i;
                } else if (min1 >= 0) {
                    if (a[i] < min1) {
                        min1 = a[i];
                        number = i;
                    }
                }
            } else {
                countNegative++;
            }

        }
        if (countNegative == a.length){
            System.out.println("Not positiv value ");
        }

        System.out.println("Minimum : " + min1 + " ");
        System.out.println("Positive Elements: " + countPositive);
        System.out.println("Element array " + number);
    }


}
