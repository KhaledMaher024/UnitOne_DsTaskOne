/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

import java.util.TreeMap;
import sun.reflect.generics.tree.Tree;

/**
 *
 * @author GP65
 */
public class Q3Class {

    public static void main(String[] args) {
        
        CustomLinkedList<Integer> numbers = new CustomLinkedList<>();
        numbers.addLast(5);//551
        numbers.addLast(1);//515
        numbers.addLast(12);
        numbers.addLast(5);
        numbers.addLast(9);
        numbers.addLast(8);
        numbers.addLast(7);
        numbers.addLast(6);
        numbers.addLast(5);
        numbers.addLast(6);
        numbers.addLast(5);
        numbers.addLast(5);
        numbers.addLast(5);
        numbers.addLast(5);
        System.out.println("Size Before Removing Duplicates : "+numbers.size());
        numbers.removeDuplicates();

        System.out.println("Size After Removing Duplicates : "+numbers.size());

    }
}
