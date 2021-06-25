/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q8;

/**
 *
 * @author GP65
 */
public class Q8 {

    public static void main(String[] args) {
        CustomLinkedList<Integer> nums = new CustomLinkedList<>();
        nums.addLast(1);
        nums.addLast(2);
        nums.addLast(3);
        nums.addLast(4);
        nums.addLast(5);
        nums.addLast(6);
        nums.addLast(7);
        nums.addLast(8);
        nums.addLast(9);
        nums.oddEvenList(nums.head);
        nums.printData(nums.head);
    }
}
