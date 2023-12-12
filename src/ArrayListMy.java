import java.util.Arrays;

public class ArrayListMy<E>{
    private int size;

    private int[] element;

    private static final int DEFAULT_CAPACITY = 10;

    public ArrayListMy() {
        this.element = new int[DEFAULT_CAPACITY];
    }
    public ArrayListMy(int initCapacity) {
        if (initCapacity >= 0) {
            this.element = new int[initCapacity];
        } else {
            throw new IllegalStateException("Capacity can't be less than 0!");
        }
    }

    public boolean addMy(int elem) {
        element[size] = elem;
        size++;
        return true;
    }
    public void addAllMy(ArrayListMy<E> elem) {
        if (elem == null) {
            return;
        }
        for (int i = 0; i < elem.size; i ++) {
            addMy(elem.element[i]);
        }
    }
    public Object getMy(int elem) {
        return element[elem];
    }
    public int remove (int index) {
        int[] temp = element;
        element = new int[temp.length - 1];
        int value = temp[index];
        System.arraycopy(temp, 0, element, 0, index);
        System.arraycopy(temp, index + 1, element, index, temp.length - index - 1);
        size--;
        return value;
    }
    public void clearMy() {
        for (int i = 0; i < size; i ++) {
            element[i] = 0;
        }
        size = 0;
    }
    public void bubbleSort() {
        boolean isSorted = false;
        int val;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < element.length - 1; i ++) {
                if (element[i] > element[i + 1]) {
                    isSorted = false;
                    val = element[i];
                    element[i] = element[i + 1];
                    element[i + 1] = val;
                }
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(element);
    }
}
