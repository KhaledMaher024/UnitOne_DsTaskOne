/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q11;

/**
 *
 * @author GP65
 */
public class Q11 {
    public static void main(String[] args) {
        CustomLinkedList<Integer> custom = new CustomLinkedList<>();
        custom.addLast(5);
        custom.addLast(30);
        custom.addLast(10);
        custom.addLast(15);
        custom.addLast(20);
        custom.addLast(25);
        
        System.out.println("Data Before :");
        custom.printData();
        System.out.println("----------------------------------");
        custom.reverse();
        System.out.println("Data After :");
        custom.printData();
    }
}
