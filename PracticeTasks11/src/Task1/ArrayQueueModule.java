package Task1;

public class ArrayQueueModule {
    static Object[] elements = new Object[1];
    static int size;
    static void enqueue(Object element) {
        assert element != null;
        ensureCapacity(size+1);
        elements[size++] = element;
    }
    static void ensureCapacity(int capacity) {
        if (capacity <= elements.length) {
            return;
        }
        Object[] newElements = new Object[capacity];
        if (size >= 0) System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }
    static Object dequeue() {
        assert size > 0;
        Object temp = elements[0];
        Object[] newElements = new Object[size-1];
        System.arraycopy(elements, 1, newElements, 0, size - 1);
        elements = newElements;
        size--;
        return temp;
    }
    static Object element() {
        assert size > 0;
        return elements[0];
    }
    static int getSize() {
        return size;
    }
    static boolean isEmpty() {
        return size == 0;
    }
    static void clear() {
        size = 0;
        elements = new Object[0];
    }
    @Override
    public String toString() {
        return super.toString();
    }
}