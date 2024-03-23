import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class CustomIteratorTest {

    @Test
    void hasNext() {
        Integer[] numbers = {1, 2, 3, 4, 5};
        CustomIterator<Integer> customIterator = new CustomIterator<>(numbers);

        assertTrue(customIterator.hasNext());
        while (customIterator.hasNext()) {
            customIterator.next();
        }
        assertFalse(customIterator.hasNext());
    }

    @Test
    void next() {
        String[] strings = {"Apple", "LG", "OnePlus"};
        CustomIterator<String> customIterator = new CustomIterator<>(strings);

        assertEquals("Apple", customIterator.next());
        assertEquals("LG", customIterator.next());
        assertEquals("OnePlus", customIterator.next());
        assertThrows(NoSuchElementException.class, customIterator::next);
    }

    @Test
    void remove() {
        Double[] doubles = {1.1, 2.2, 3.3, 4.4};
        CustomIterator<Double> customIterator = new CustomIterator<>(doubles);

        customIterator.next();
        customIterator.remove();

        assertThrows(IllegalStateException.class, customIterator::remove);
    }
}