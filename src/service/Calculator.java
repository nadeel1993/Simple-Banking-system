package service;

public interface Calculator<T, V> {
    public T calculate(V input);
}
