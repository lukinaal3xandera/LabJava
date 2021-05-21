package com.company;

import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int N;

        Scanner console = new Scanner(System.in);
        System.out.print("Количество элемнтов  ");
        N = console.nextInt();

        Random random = new Random();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 2) - 1);
            System.out.print("  " + arr[i]);
        }
        System.out.println();
            xSort (N, arr);
        }
	// write your code here
    public static void xSort(int N,int[] arr) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            for (int i = 0; i < N; i++) {
                    if (arr[i]>arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                    System.out.print("  " + temp);}
                }

        }
    }
}

