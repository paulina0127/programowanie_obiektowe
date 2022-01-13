public class Pair<T> {
    private T first;
    private T second;

    // KONSTRUKTORY
    public Pair() {
        first = null;
        second = null;
    }

    public Pair (T first, T second) {
        this.first = first;
        this.second = second;
    }

    // METODY
    public void swap() {
        T temp = this.first;
        this.first = this.second;
        this.second = temp;
    }

    // METODY DOSTĘPOWE
    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }

    public void setFirst (T newValue) {
        first = newValue;
    }
    public void setSecond (T newValue) {
        second = newValue;
    }
}