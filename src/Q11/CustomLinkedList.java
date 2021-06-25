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
public class CustomLinkedList<E> {

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public void reverse() {

        Node<E> current = head;
        for (int i = 0; i < size / 2; i++) {
            Node<E> temp = head;
            int moves = size - 1 - i;
            for (int j = 0; j < moves; j++) {
                temp = temp.getNext();

            }

            E tempValue = current.getElement();
            current.setElement(temp.getElement());
            temp.setElement(tempValue);
            current = current.getNext();
        }
    }

    public void printData() {
        Node<E> current = head;
        System.out.print(current.getElement() + "  ");
        while (current.getNext() != null) {
            current = current.getNext();
            System.out.print(current.getElement() + "  ");
        }
        System.out.println("");
    }

    public CustomLinkedList() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E getFirst() {
        if (isEmpty()) {
            return null;
        }
        return head.getElement();
    }

    public E getLast() {
        if (isEmpty()) {
            return null;
        }
        return tail.getElement();
    }

    public E get(int index) {
        if (isEmpty()) {
            return null;
        } else if (index < size) {
            Node<E> element = head;
            int counter = 0;
            while (counter != index) {
                if (element != null) {

                    element = element.getNext();
                } else {
                    return null;
                }
                counter++;
            }
            return element.getElement();
        }
        return null;
    }

    public void addFirst(E e) {
        head = new Node(e, head);
        if (isEmpty()) {
            tail = head;
        }
        size++;
    }

    public void addLast(E e) {
        Node<E> newes = new Node(e, null);
        if (isEmpty()) {
            head = newes;
        } else {
            tail.setNext(newes);

        }
        tail = newes;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if (isEmpty()) {
            tail = null;
        }
        return answer;
    }

    public E removeLast() {
        if (isEmpty()) {
            return null;
        }
        E element = tail.getElement();
        if (size == 1) {
            head = tail = null;
            size--;
            return element;
        }

        Node<E> temp = head;
        while (temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }
        tail = temp;
        temp.next = null;
        size--;
        return element;
    }

    public E remove(int index) {
        if (isEmpty() || index < 0 || index > size - 1) {
            return null;
        }
        if (index == 0) {
            E element = head.getElement();
            removeFirst();
            return element;
        }
        if (index == size - 1) {
            E element = tail.getElement();
            removeLast();
            return element;
        }
        if (index < size) {
            E element = null;
            Node<E> temp = head;
            for (int i = 0; i <= size - 2; i++) {
                if (i == index) {
                    element = temp.getElement();
                    temp = temp.getNext();
                }
                temp = temp.getNext();
            }
            size--;
            return element;
        }
        return null;
    }

    public int indexOf(E e) {
        Node<E> element = head;
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (e.equals(element.getElement())) {
                return i;
            }
            element = element.getNext();
        }

        return -1;

    }

    private class Node<E> {

        E element;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

    }
}
