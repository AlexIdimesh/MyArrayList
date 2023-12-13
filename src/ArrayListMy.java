import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListMy<T> {
    // 1. Параметризованный тип +
    // 2. Конструктов, который позволяет передавать другую коллекцию +
    // 3. Фабричный метод of* +
    // 4. Comparator / сортировка +
    // 5. Динамеческий массив +
    private int size;

    private T[] elements;

    private static final int DEFAULT_CAPACITY = 10;

    public ArrayListMy() {
        this.elements = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public static ArrayListMy of(Object element) {
        return new ArrayListMy(Collections.singleton(element));
    }

    public ArrayListMy(int initCapacity) {
        if (initCapacity >= 0) {
            this.elements =(T[]) new Object[initCapacity];
        } else {
            throw new IllegalStateException("Capacity can't be less than 0!");
        }
    }

    public ArrayListMy(Collection<? extends T> collection) {
        if (!collection.isEmpty()) {
            this.elements = (T[]) collection.toArray();
            this.size = elements.length;
        }
    }

    private boolean isEmpty() {
        return false;
    }

    public void addMy(T elem) {
        if (size == elements.length ) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size] = elem;
        size++;
    }

    public void addAllMy(ArrayListMy<? extends T> elem) {
        if (elem == null) {
            return;
        }
        for (int i = 0; i < elem.size; i++) {
            addMy((T) elem.elements[i]);
        }
    }

    public T getMy(int elem) {
        return (T) elements[elem];
    }

    public void removeMy(int index) {
        Object[] temp = elements;
        elements = (T[]) new Object[temp.length - 1];
        System.arraycopy(temp, 0, elements, 0, index);
        System.arraycopy(temp, index + 1, elements, index, temp.length - index - 1);
        size--;
    }

    public void clearMy() {
        for (int i = 0; i < size; i++) {
            elements[i] = (T) new Object();
        }
        size = 0;
    }
    public void sort(Comparator<? super T> comparator) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < elements.length - 1; i++) {
                if (comparator.compare(elements[i], elements[i + 1]) > 0) {
                    swap(i, i + 1);
                    flag = true;
                }
            }
        }
    }
    public static <E> void sort(ArrayListMy<? extends E> list, Comparator<? super E> comparator) {
        list.sort(comparator);
    }
    private void swap(int first, int second) {
        T temp = (T) elements[first];
        elements[first] = elements[second];
        elements[second] = temp;
    }
    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}

