package part5.api;

public interface Interval<T> {
    public void print();
    public int compareTo(T another);
}
