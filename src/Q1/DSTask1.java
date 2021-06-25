/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

import com.sun.scenario.effect.Merge;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author GP65
 */
public class DSTask1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String x= "Silent";
        String x2= "tSenil";
        System.out.println(isAnagram(x, x2));
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] str1_characters = str1.toCharArray();
        char[] str2_characters = str2.toCharArray();
        Arrays.sort(str1_characters);
        Arrays.sort(str2_characters);
        for (int i = 0; i < str1.length(); i++) {
            if(str1_characters[i] != str2_characters[i]){
                return false ; 
            }
        }
        return true;
    }
}
