package org.example.generic;

public class ConcPair<K,V> extends Pair<K,V> {
    public ConcPair(K key, V value) {
        super(key, value);
    }

    @Override
    public Pair<K, V> put(K key, V value) {
        return new ConcPair<>(key, value);
    }
}
