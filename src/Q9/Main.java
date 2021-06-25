/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q9;

/**
 *
 * @author GP65
 */
public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(5);
        System.out.println("front : "+queue.peek());
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        System.out.println("front : "+queue.peek());
        queue.enqueue(9);
        queue.dequeue();
        System.out.println("front : "+queue.peek());
        queue.dequeue();
        System.out.println("front : "+queue.peek());
        
    }
}
