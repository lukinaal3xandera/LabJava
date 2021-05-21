package com.company;

import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x,y,a, b;

        Scanner console = new Scanner(System.in);

        System.out.print("Количество строк: ");
        x = console.nextInt();
        System.out.print("Количество столбцов: ");
        y = console.nextInt();
        System.out.print("Число, которое нужно искать: ");
        a = console.nextInt();

        Random random = new Random();
        int[][] arr = new int[x][y];

        b = x+y;
        if (a > b){
            System.out.println(a);
        }


	// write your code here
    }
}
