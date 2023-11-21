package org.example.lesson2;

public class Lesson2_7 {
    public static void main(String[] args) {

        //Виведення значень в матриці на консоль
        int[][] matrix = new int[][]{
                {5,6,4},
                {3,2,1},
                {7,8,9,44,65,46,56,34}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("the element of " + i +" row " + j + " column = " + matrix[i][j]);
                    if (j == matrix[i].length-1){
                        System.out.println(" ");
                    }

            }

        }

    }
}
