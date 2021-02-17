package Java1_Ivan_Lesson1;

import java.util.Arrays;

public class HW_1 {
    public static void main(String[] args) {
//        byte b = 10;
//        short s = 0;
//        int i = 100;
//        long l = 1000L;
//        double d = 1.5;
//        float f = 10.5f;
//        char c = 'A';
//        boolean bool = true;
//        System.out.println(" " + b + s + i + l + d + f + c + bool);
//
//        System.out.println(result(2, 5, 6, 7));
//        System.out.println(result_10to_20(5, 15));
//        resultPositive(-1);
//        System.out.println(resultPosNeg(0));
//        System.out.println(helloName("Dmitry"));
//        year(200);
//        boolean[] bool = new boolean[6];
//        char[] arrChar = new char[6];
//        byte [] b = new byte[7];
//        short [] s = new short[8];
//        int [] i = new int[9];
//        long [] l = new long[10];
//        double [] d = new double[11];
//        float [] f = new float[12];
//        String [] str = new String[15];
//        System.out.println(Arrays.toString(bool));
//        System.out.println(Arrays.toString(arrChar));
//        System.out.println(Arrays.toString(b));
//        System.out.println(Arrays.toString(s));
//        System.out.println(Arrays.toString(i));
//        System.out.println(Arrays.toString(l));
//        System.out.println(Arrays.toString(d));
//        System.out.println(Arrays.toString(f));
//        System.out.println(Arrays.toString(str));
//
//        int[][] arr = new int[7][10];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = i * j;
////                System.out.printf("%7d", arr[i][j]);
//            }
////            System.out.println();
//        }


    }

    public static float result(int a, int b, int c, int d) {
        return a * (b + (c * 1.0f / d));
    }

    public static boolean result_10to_20(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public static void resultPositive(int a) {
        if (a < 0) System.out.println("Negative");
        else System.out.println("Positive");
    }

    public static boolean resultPosNeg(int a) {
        return a < 0;
    }

    public static String helloName(String str) {
        return "Hello, " + str;
    }

    public static void year(int i) {
        if (i % 400 == 0) {
            System.out.println("yes");
        } else if (i % 100 == 0) {
            System.out.println("no");
        } else if (i % 4 == 0) {
            System.out.println("Yes");
        } else System.out.println("Noooo");
    }
}
