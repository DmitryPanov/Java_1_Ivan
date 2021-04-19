package Java1_Ivan_Lesson3_TicTacToe;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Asmr {

    public static int method(int a, int b) throws ArithmeticException {
        return a/b;
    }

    public static void main(String[] args) {

        try {
            method(5,0);
        } catch (ArithmeticException e){
            System.out.println(e.getClass() );
            System.out.println(e.getMessage());
            System.out.println(3);
        }


//
//        int a = 15;
//        int b = a;
//        System.out.println("a = " + a + " and b = "+ b);
//        a = 33;
//        System.out.println("a = " + a + " and b = "+ b);
//


//        String str1 = "Hello";
//        String str2 = "Hello";
//        String str3 = "Hello";
//
//        str.equals(str);
//        StringBuilder sb;
//
//        long start = System.nanoTime();
//        for (int i = 0; i < 100000; i++) {
//            str += i;
//        }
//        float delta = (System.nanoTime() - start) * 0.000000001f;
//        System.out.println(delta + " sec");
//
//        System.out.println(str == str1 && str2 == str3);
//        Scanner in = new Scanner(System.in);
//        char nw = in.next().charAt(0);
//        char answer;
//        char[] alfa = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm', 'q'};
//        for (int i = 0; i < alfa.length; i++) {
//            if (alfa[i] == nw) {
//                answer = alfa[i + 1];
//                System.out.println(answer);
//                break;
//            }
//        }
    }

    public static void AAA(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(a + " i " + i);
            if (i ==3 ) return;
        }
    }
}

