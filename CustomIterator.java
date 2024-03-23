import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Arrays;

public class CustomIterator<E> implements Iterator<E> {
    private E[] elements;
    private int currentIndex;

    public CustomIterator(E[] elements) {
        this.elements = elements;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < elements.length;
    }

    @Override
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return elements[currentIndex++];
    }

    @Override
    public void remove() {
        if (currentIndex == 0) {
            throw new IllegalStateException("next() method has not been called, or the element has already been removed");
        }
        for (int i = currentIndex - 1; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements = Arrays.copyOf(elements, elements.length - 1);
        currentIndex--;
    }
}