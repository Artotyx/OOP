package lab5;

public class AnimalLinkedList {
    private class Node {
        Animal element;
        Node next;
        Node prev;

        Node(Animal element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    private int size;
    private Node header;

    public AnimalLinkedList() {
        header = new Node(null, null, null);
        header.next = header;
        header.prev = header;
        size = 0;
    }

    private void add(Animal animal, Node node) {
        Node newNode = new Node(animal, node, node.prev);
        newNode.prev.next = newNode;
        newNode.next.prev = newNode;
        size++;
    }

    public void add(Animal animal) {
        add(animal, header.next);
    }

    public void addAll(AnimalArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            add(arrayList.get(i), header.next);
        }
    }

    private Node findNodeByIndex(int i) {
        if (i < 0 || i >= size) {
            return null;
        }
        Node current = header.next;
        for (int j = 0; j < i; j++) {
            current = current.next;
        }
        return current;
    }

    public Animal get(int i) {
        Node node = findNodeByIndex(i);
        return (node != null) ? node.element : null;
    }

    public void clear() {
        header.next = header;
        header.prev = header;
        size = 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        Node current = header.next;
        while (current != header) {
            str.append(current.element);
            if (current.next != header) {
                str.append(", ");
            }
            current = current.next;
        }
        str.append("]");
        return str.toString();
    }
}

