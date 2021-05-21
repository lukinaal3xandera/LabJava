package com.company;

import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int row, column;

        Scanner console = new Scanner(System.in);
        System.out.print("Количество строк: ");
        row = console.nextInt();
        System.out.print("Количество столбцов: ");
        column = console.nextInt();

        Random random = new Random();
        int[][] arr = new int[row][column];

        for (int r = 0; r < row; r++) { //заполнение массива
            for (int c = 0; c < column; c++) {
                arr[r][c] = 50 - random.nextInt(100);
            }
        }
        for (int r = 0; r < row; r++) { // вывод массива
            for (int c = 0; c < column; c++) {
                System.out.print("" + arr[r][c] + "|");
            }
            System.out.println();
        }

        rowSumma(row,column,arr);
    }

    private static void rowSumma(int row, int column, int[][] arr) {
        for (int r = 0; r < row; r++) { // сумма строки
            int rowSum = 0;
            for (int c = 0; c < column; c++) {
                rowSum = rowSum + arr[r][c];
            }
            System.out.print("||" + rowSum);
        }
    }


}