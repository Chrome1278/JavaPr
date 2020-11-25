package Task1;

import java.util.Arrays;
public class ArrayQueueADT {
    private Object[] elements = new Object[1];
    private int size;
    public static void push(ArrayQueueADT queue, Object element) {
        assert element != null;
        ensureCapacity(queue, queue.size + 1);
        queue.elements[queue.size++] = element;
    }
    private static void ensureCapacity(ArrayQueueADT queue, int capacity) {
        if (capacity <= queue.elements.length) return;
        Object[] newElements = new Object[capacity];
        if (queue.size >= 0)
            System.arraycopy(queue.elements, 0, newElements, 0, queue.size);
        queue.elements = newElements;
    }
    public static Object element(ArrayQueueADT queue) {
        assert queue.size > 0;
        return queue.elements[0];
    }
    static Object dequeue(ArrayQueueADT queue) {
        assert queue.size > 0;
        Object temp = queue.elements[0];
        Object[] newElements = new Object[queue.size-1];
        System.arraycopy(queue.elements, 1, newElements, 0, queue.size - 1);
        queue.elements = newElements;
        queue.size--;
        return temp;
    }
    static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }
    public static int getSize(ArrayQueueADT queue) {
        return queue.size;
    }
    static void clear(ArrayQueueADT queue) {
        queue.size = 0;
        queue.elements = new Object[0];
    }
    @Override
    public String toString() {
        return "Task1.ArrayQueueADT: size = " + size + ", elements = " + Arrays.toString(elements);
    }
}