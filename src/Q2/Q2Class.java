/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

/**
 *
 * @author GP65
 */
public class Q2Class {

    public static void main(String[] args) {
 System.out.println("Rotating Array 5 times to Left");
        rotateLift(5);
    }

    public static void rotateLift(int k) {
        String[] names = {"Khaled", "Fadi", "Mohammed", "Loay", "Dalia", "Ali", "Shaymaa", "Raed"};
        String[] splitedArray = new String[k];
        System.arraycopy(names, 0, splitedArray, 0, k);

        for (int i = k; i < names.length; i++) {
            String temp = names[i];
            names[i - k] = temp;
        }
        for (int i = 0; i < k; i++) {
            String temp = splitedArray[i];
            names[names.length - k + i] = temp;
        }

        for (String name : names) {
            System.out.print(name + "  ");
        }
        System.out.println();

    }
}
