/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q16;

/**
 *
 * @author GP65
 */
public class Q16 {

    public static void main(String[] args) {
        int superDigit = superDigit(29634);
        System.out.println("super Digigt : "+superDigit);
    }

    public static int superDigit(int value) {
        String s_value = value + "";
        int sum = 0;
        for (int i = 0; i < s_value.length(); i++) {
            int c =  Integer.parseInt(s_value.substring(i,i+1));
            sum += c;
        }
        return sum;
    }

}
