package com.matrix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int rzad;
        int kolumna;

        Scanner in = new Scanner(System.in);

        System.out.println("Wprowadź liczbę rzędów");
        rzad = in.nextInt();
        System.out.println("wprowadź liczbę kolumn");
        kolumna = in.nextInt();

        int[][] macierza = new int[rzad][kolumna];
        int[][] macierzb = new int[rzad][kolumna];
        int[][] macierzwynik = new int[rzad][kolumna];
        int[][] macierzwynik2= new int[rzad][kolumna];
        System.out.println("wprowadź elementy macierzy A");
        for (int x = 0; x < rzad; x++) {
            for (int y = 0; y < kolumna; y++) {
                macierza[x][y] = in.nextInt();
            }
        }
        System.out.println("wprowadź elementy macierzy B");
        for (int x = 0; x < rzad; x++) {
            for (int y = 0; y < kolumna; y++) {
                macierzb[x][y] = in.nextInt();
            }
        }
        System.out.println("suma macierzy A i B");
        for (int x = 0; x < rzad; x++) {
            for (int y = 0; y < kolumna; y++) {
                macierzwynik[x][y] = macierza[x][y] + macierzb[x][y];

                System.out.print(macierzwynik[x][y]);

                System.out.println();
            }
        }
        System.out.println("mnożenie macierzy");
        for (int x = 0; x < rzad; x++) {
            for (int y = 0; y < kolumna; y++) {
                for (int i = 0; i < rzad; i++) {
                    macierzwynik2[x][y]+= macierza[x][i]*macierzb[i][y];
                }
                System.out.println(macierzwynik[x][y]);
            }
        }
    }
}

