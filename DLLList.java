package adts;

import interfaces.ListInterface;
import nodes.DLLNode;

public class DLLList<E> implements ListInterface<E>
{
    protected DLLNode<E> head;
    protected DLLNode<E> tail;
    protected DLLNode<E> location;
    protected DLLNode<E> next;
    protected DLLNode<E> previous;

    protected int numElements;

    @Override
    public void add(E element) {
        
    }

    @Override
    public boolean remove(E element) {

        return false;
    }

    @Override
    public int size() {

        return 0;
    }

    @Override
    public boolean isEmpty() {
        
        return false;
    }

    @Override
    public boolean contains(E element) {
        
        return false;
    }

    @Override
    public E get(E element) {
        
        return null;
    }

    @Override
    public E get(int index) {
        
        return null;
    }

    @Override
    public String toString()
    {
        
        return null;
    }

}
