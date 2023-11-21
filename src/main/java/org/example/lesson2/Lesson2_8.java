package org.example.lesson2;

import java.util.Arrays;
import java.util.Random;

public class Lesson2_8 {
    public static void main(String[] args) {
        //Реалізуємо приклад заповнення матриці довльних розмірів довільними значеннями.
        Random random = new Random();

        int s = random.nextInt(1,5);
        int k = random.nextInt(1,5);

        int[][] matr = new int[s][k];
        System.out.println("Length of Matrix =" + matr.length);
        System.out.println("Length of Matrix columns =" + matr[matr.length-1].length);

        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                    matr[i][j]=random.nextInt(-50,50);
                    //System.out.println(matr[i][j]);
            }
        }
        //System.out.println(Arrays.toString(matr));

        System.out.println("Massive ");

        for (int i = 0; i < matr.length; i++) {
            System.out.println("");
            for (int j = 0; j < matr[i].length; j++) {
                System.out.print(matr[i][j]+",");
            }
        }
    }
}
