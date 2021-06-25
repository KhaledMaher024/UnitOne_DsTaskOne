/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q12;

/**
 *
 * @author GP65
 */
public class Q12 {

    public static void main(String[] args) {
        String greeting = "Welcome to my Program";
        System.out.println("Maximum Ocurring Character : " + getMaxChar(greeting));
    }

    public static char getMaxChar(String str) {
        int count[] = new int[256];

        int len = str.length();
        for (int i = 0; i < len; i++) {
            count[str.charAt(i)]++;
        }

        int max = -1;
        char result = ' ';

        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }

}
