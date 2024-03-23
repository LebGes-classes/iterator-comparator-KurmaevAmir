public class ComparableObject implements Comparable<ComparableObject> {
    private final int value;

    public ComparableObject(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(ComparableObject otherObject) {
        return this.value - otherObject.value;
    }

    public int getValue() {
        return value;
    }
}
