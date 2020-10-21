import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedDeque;

public abstract class WaitList<E> implements IWaitList<E> {

    protected ConcurrentLinkedDeque<E> content;

    public WaitList(){
        content = new ConcurrentLinkedDeque<E>();
    }

    public WaitList(Collection<E> c) {
        content = (ConcurrentLinkedDeque<E>) c;
    }

    @Override
    public String toString() {
        return "WaitList: " + "content = " + content;
    }

    @Override
    public void add(E element) {
        content.add(element);
    }

    @Override
    public <E> void remove() {
        content.removeFirst();
    }

    @Override
    public boolean contains(E element) {
        for (E e : this.content) {
            if (e.equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.size() == 0;
    }
}
