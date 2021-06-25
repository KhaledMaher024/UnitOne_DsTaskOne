/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q9;

import java.util.Stack;

/**
 *
 * @author GP65
 */
public class MyQueue<E> {

    Stack<E> popStack = new Stack<>();
    Stack<E> pushStack = new Stack<>();
    E front = null;

    public void enqueue(E x) {
        if (pushStack.empty()) {
            front = x;
        }
        while (!pushStack.isEmpty()) {
            popStack.push(pushStack.pop());
        }
        popStack.push(x);
        while (!popStack.isEmpty()) {
            pushStack.push(popStack.pop());
        }
    }

    public void dequeue() {
        pushStack.pop();
        if (!pushStack.empty()) {
            front = pushStack.peek();
        }
    }

    public E peek() {
        return front;
    }

}
