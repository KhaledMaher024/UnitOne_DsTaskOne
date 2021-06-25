/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q7;

/**
 *
 * @author GP65
 */
public class Q7 {

    public static void main(String[] args) {
        // TODO code application logic here

        int[] A = {10, 20, 30, 70, 100, 0, 0, 0, 0};
        int[] B = {40, 80, 90, 120};
        mergeArrays(A, B);
    }

    static void sortedMerge(int a[], int b[], int n, int m) {
        int i = n - 1;
        int j = m - 1;

        int lastIndex = n + m - 1;

        while (j >= 0) {

            if (i >= 0 && a[i] > b[j]) {
                a[lastIndex] = a[i];
                i--;
            } else {
                a[lastIndex] = b[j];
                j--;
            }
            lastIndex--;
        }
    }

    public static void mergeArrays(int[] A, int[] B) {
        int fullElementsCountA = 0;
        int fullElementsCountB = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] != 0) {
                fullElementsCountA++;
            }

        }
        for (int i = 0; i < B.length; i++) {
            if (B[i] != 0) {
                fullElementsCountB++;
            }

        }
        sortedMerge(A, B, fullElementsCountA, fullElementsCountB);
        for (int k : A) {
            System.out.println(k);
        }
    }
}
