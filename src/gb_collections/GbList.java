package gb_collections;

public interface GbList<T> extends Iterable<T>{
    void add(T value);
    void add(int index, T value);
    T get(int index);
    void removeValue(T value);
    void removeIndex(int index);
    int size();
}
