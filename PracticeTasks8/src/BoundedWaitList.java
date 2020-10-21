public class BoundedWaitList<E> extends WaitList<E> {

    private int capacity;

    BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if (content.size() < getCapacity())
            super.add(element);
    }

    @Override
    public String toString() {
        return "BoundedWaitList: " + "content = " + content;
    }
}
