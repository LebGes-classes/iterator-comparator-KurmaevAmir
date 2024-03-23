import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparatorObjectTest {

    @Test
    void compare() {
        ComparableObject obj1 = new ComparableObject(5);
        ComparableObject obj2 = new ComparableObject(10);

        ComparatorObject comparator = new ComparatorObject();
        assertTrue(comparator.compare(obj1, obj2) < 0);
    }
}