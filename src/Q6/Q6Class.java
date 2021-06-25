/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q6;

/**
 *
 * @author GP65
 */
public class Q6Class {

    public static void main(String[] args) {
        CustomLinkedList<Integer> nums = new CustomLinkedList<>();
        nums.addLast(5);
        nums.addLast(6);
        nums.addLast(7);
        nums.addLast(9);
        nums.addLast(8);
        nums.addLast(20);
        nums.addLast(288);
        nums.addLast(222);
        nums.addLast(30);
        nums.addLast(40);
        nums.addLast(50);
        nums.addLast(60);
        nums.addLast(70);
        nums.addLast(80);
        nums.addLast(20);
        nums.addLast(66);
        
        System.out.println(nums.getMiddle());
    }
}
