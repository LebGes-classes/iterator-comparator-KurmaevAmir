import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparableObjectTest {

    @Test
    void compareTo() {
        ComparableObject obj1 = new ComparableObject(5);
        ComparableObject obj2 = new ComparableObject(10);
        assertTrue(obj1.compareTo(obj2) < 0);
    }
}