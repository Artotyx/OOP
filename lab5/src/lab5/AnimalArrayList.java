package lab5;

public class AnimalArrayList {
    private Animal[] arrayList;
    private int size;
    public AnimalArrayList(int initSize) {
        arrayList = new Animal[initSize];
    }
    public AnimalArrayList() {
        arrayList = new Animal[10];
    }
    public int size() {
        return this.size;
    }
    public boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }
    private void copyElementsFrom(Animal[] oldElements, Animal[] newArrayList) {
        for (int i = 0; i < oldElements.length; i++) {
            this.arrayList[i] = oldElements[i];
        }

    }
    private void checkSize(int needCapacity) {
        if (needCapacity > arrayList.length * 0.7) {
            Animal[] newArrayList = new Animal[arrayList.length * 2];
            copyElementsFrom(arrayList, newArrayList);
            arrayList = newArrayList;
        }
    }
    public boolean add(Animal element) {
        checkSize(size+1);
        arrayList[size] = element;
        size ++;
        return true;
    }
    public void set(int index, Animal element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

    }
    public Animal get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index: " + index + ", Size: " + size);
        } else {
            return arrayList[index];
        }
        return null;
    }
    public void clear() {
        arrayList = new Animal[10];
        size = 0;
    }
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < size; i++) {
            str.append(arrayList[i]);
            if (i != size - 1) {
                str.append(", ");

            }
        }
        str.append("]");
        return str.toString();
    }
}
