package stack;

import java.util.ArrayList;
import java.util.List;

public class StackE<T>{
    private int capacity;
    private List<T> array;

    public StackE(int capacity){
        this.capacity = capacity;
        array = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize(){
        return array.size();
    }

    public boolean isEmpty(){
      return array.isEmpty();
    }

    public boolean isFull(){
        return capacity==array.size();
    }

    public void push(T value) throws StackException {
        if (isFull())
            throw new StackException("Stack is full");
        else
            array.add(value);
    }

    public void pop() throws StackException {
        if (isEmpty())
            throw new StackException("Stack if empty");
        else
            array.remove(array.size()-1);
    }

    public T top() throws StackException {
        if (isEmpty()){
            throw new StackException("Stack is empty");
        }
        else
            return array.get(array.size()-1);
    }

    public void print(){
        for (T t : array)
            System.out.print(t + "  ");
        System.out.println();
    }

    public void clear(){
        array.clear();
    }
}
