package gb_collections.lists;

import gb_collections.GbList;
import gb_collections.lists.util.ArrayIterator;

import java.util.Iterator;

public class GbLinkedList<E> implements GbList<E> {
    private E[] values;
    private int size;
    private Node<E> head;

    @SuppressWarnings("unchecked")
    public GbLinkedList() {
        this.size = size;
        this.values = (E[]) new Object[size];
    }

    @Override
    public void add(E value) {
        if (head == null) {
            this.head = new Node<>(value);
        } else {
            Node<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<>(value);
        }
        size++;
    }

    @Override
    public void add(int index, E value) {
        values[index] = value;
    }

    @Override
    public E get(int index) {
        int count = 0;
        Node<E> current = head;
        while (count != index) {
            current = current.next;
            count++;
        }
        return current.value;
    }

    @Override
    public void removeValue(E value) {

    }

    @Override
    public void removeIndex(int index) {
        if (index == 0){
            head = head.next != null ? head = head.next : null;
            size--;
            return;
        }
        int count = 0;
        Node<E> prev = null;
        Node<E> current = head;
        while (count != index) {
            prev = current;
            current = current.next;
            count++;
        }
        if (prev != null) {
            prev.next = current.next;
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<E>(toArray());
    }
    public E[] toArray() {
        E[] result = (E[]) new Object[size];
        Node<E> prev = null;
        Node<E> current = head;
        int i = 0;
        while (current.next != null){
            result[i] = current.value;
            current = current.next;
            i++;
        }
        return result;
    }

    private static class Node<E> {
        private E value;
        private Node<E> next;

        public Node(E value) {
            this.value = value;
            this.next = null;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        Node<E> current = head;
        while (current != null) {
            builder.append(current.value).append(", ");
            current = current.next;
        }
        builder.append("]");
        return builder.toString();
    }

}