import java.util.LinkedList;

public class GenericQueue<E> extends LinkedList<E> {

    public void enqueue(E e) {
        addLast(e);
    }
    public E dequeue() {
        return removeFirst();
    }
    public int getSize() {
        return size();
    }
    @Override
    public String toString() {
        return "Queue: " + super.toString();
    }
    public static void main(String[] args) {
        GenericQueue<Integer> queue = new GenericQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue);
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println(queue);
        System.out.println("Size: " + queue.getSize());
    }
}

