package Iterators;
import java.util.Iterator;

public class Prog1OurGenericList<T> implements Iterable<T>{
    private T[] items;
    private int size;
    public Prog1OurGenericList(){
        size = 0;
        items = (T[])new Object[100];
    }
    public void add(T item){
        items[size++] = item;
    }
    public T getItemAtIndex(int Index){
        return items[Index];
    }
    @Override
    public Iterator<T> iterator() {
        return new OurGenericIterator(this);
    }
    private class OurGenericIterator implements Iterator<T>{
        private Prog1OurGenericList<T> list;
        private int index = 0;
        public OurGenericIterator(Prog1OurGenericList<T> list){
            this.list = list;
        }
        @Override
        public boolean hasNext() {
            return index < list.size;
        }

        @Override
        public T next() {
            return list.items[index++];
        }
        
    }
}
