import java.util.Comparator;

public class ComparatorObject implements Comparator<ComparableObject> {
    @Override
    public int compare(ComparableObject obj1, ComparableObject obj2) {
        return obj1.getValue()- obj2.getValue();
    }
}
