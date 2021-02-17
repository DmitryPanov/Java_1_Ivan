package Java1_Ivan_Lesson3_TicTacToe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static final char DOT_HUMAN = 'X';
    public static final char DOT_AI = 'Y';
    public static final char DOT_EMPTY = '*';
    public static final int FIELD_SIZE_X = 3;
    public static final int FIELD_SIZE_Y = 3;
    public static char[][] field;
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        while (true) {
            initMap();
            printMap();
            playOnce();

            System.out.println("Play again? Exit: print no");
            if (SCANNER.next().equals("no")) break;
        }
    }

    public static void playOnce() {
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_HUMAN)) {
                System.out.println("Выйграл человек");
                break;
            }
            if (draw()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_AI)) {
                System.out.println("Выйграл компьютер");
                break;
            }
            if (draw()) {
                System.out.println("Ничья");
                break;
            }

        }
    }

    //humanTurn
    public static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты хода Х и У (от 1 до 3) через пробел");
            y = SCANNER.nextInt() - 1;
            x = SCANNER.nextInt() - 1;
        } while (!isVallidCell(x, y) || !isEmptyCell(x, y));
        field[y][x] = DOT_HUMAN;

    }

    //isVallidCell
    public static boolean isVallidCell(int x, int y) {
        return x >= 0 && x < FIELD_SIZE_X && y >= 0 && y < FIELD_SIZE_Y;
    }

    //isEmptyCell
    public static boolean isEmptyCell(int x, int y) {
        return field[y][x] == DOT_EMPTY;
    }

    //draw
    public static boolean draw() {
        for (int y = 0; y < FIELD_SIZE_Y; y++) {
            for (int x = 0; x < FIELD_SIZE_X; x++) {
                if (field[y][x] == DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }

    //checkWin
    private static boolean checkWin(char c) {
        if (field[0][0] == c && field[0][1] == c && field[0][2] == c) return true;
        if (field[1][0] == c && field[1][1] == c && field[1][2] == c) return true;
        if (field[2][0] == c && field[2][1] == c && field[2][2] == c) return true;

        if (field[0][0] == c && field[1][0] == c && field[2][0] == c) return true;
        if (field[0][1] == c && field[1][1] == c && field[2][1] == c) return true;
        if (field[0][2] == c && field[1][2] == c && field[2][2] == c) return true;

        if (field[0][0] == c && field[1][1] == c && field[2][2] == c) return true;
        if (field[0][2] == c && field[1][1] == c && field[2][0] == c) return true;
        return false;
    }

    //aiTurn
    public static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(FIELD_SIZE_X);
            y = RANDOM.nextInt(FIELD_SIZE_Y);
        } while (!isEmptyCell(x, y));
        field[y][x] = DOT_AI;
    }
    //main


    public static void initMap() {
        field = new char[FIELD_SIZE_X][FIELD_SIZE_Y];
        for (int y = 0; y < FIELD_SIZE_Y; y++) {
            for (int x = 0; x < FIELD_SIZE_X; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("    ");
        for (int i = 0; i < FIELD_SIZE_X; i++) {
            System.out.print(i + 1 + " | ");
        }
        System.out.println();
        for (int i = 0; i < FIELD_SIZE_X; i++) {
            System.out.print(i + 1 + " | ");
            for (int j = 0; j < FIELD_SIZE_Y; j++) {
                System.out.print(field[i][j] + " | ");
            }
            System.out.println();

        }
        System.out.println("- - - - - - - -");
    }
}
