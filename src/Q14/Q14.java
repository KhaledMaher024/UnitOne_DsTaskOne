/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q14;

/**
 *
 * @author GP65
 */
public class Q14 {

    public static void main(String[] args) {
        int[][] m = {{1, 1, 1 , 1}, {4, 5, 6, 4}, {4, 3, 16,7}, {4, 22, 8,9}};
        int[][] m2 = {{4, 5, 6}, {4, 5, 6}, {4, 5, 6}};
        System.out.println(absOfDiagonals(m, m2));
    }

    public static int sumOfDiagonals(int[][] matrix1) {
        int firstDiagonalSum = 0;
        int secDiagonalSum = 0;
        int counter = matrix1.length - 1;
        for (int i = 0; i < matrix1.length; i++) {
            firstDiagonalSum += matrix1[i][i];
            secDiagonalSum += matrix1[i][counter];
            counter--;
        }
        return firstDiagonalSum + secDiagonalSum;
    }

    public static int absOfDiagonals(int[][] matrix1, int[][] matrix2) {
        return Math.abs(sumOfDiagonals(matrix1) - sumOfDiagonals(matrix2));
    }
}
