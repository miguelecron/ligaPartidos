package model;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MiTreeeSet implements Set<Partido> {

    TreeSet<Partido> partidos = new TreeSet<>();

    @Override
    public int size() {
        return partidos.size();
    }

    @Override
    public boolean isEmpty() {
        return partidos.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return partidos.contains(o);
    }

    @Override
    public Iterator<Partido> iterator() {
        return partidos.iterator();
    }

    @Override
    public Object[] toArray() {
        return partidos.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return partidos.toArray(a);
    }

    @Override
    public boolean add(Partido partido) {
        return partidos.add(partido);
    }

    @Override
    public boolean remove(Object o) {
        return partidos.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return partidos.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Partido> c) {
        return partidos.addAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return partidos.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return partidos.removeAll(c);
    }

    @Override
    public void clear() {
        partidos.clear();
    }
}
