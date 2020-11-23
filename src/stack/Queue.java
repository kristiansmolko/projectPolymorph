package stack;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    private int capacity;
    private List<T> array;

    public Queue(int c){
        this.capacity = c;
        array = new ArrayList<>();
    }

    public int getCapacity(){
        return capacity;
    }

    public int getSize(){
        return array.size();
    }

    public boolean isEmpty(){
        return array.isEmpty();
    }

    public boolean isFull(){
        return capacity == array.size();
    }

    public void enqueue(T value){
        if (isFull())
            System.out.println("\033[31mQueue is full!\033[0m");
        else
            array.add(value);
    }

    public void dequeue(){
        if (isEmpty())
            System.out.println("\033[31mQueue is empty!\033[0m");
        else
            array.remove(array.size()-capacity);
    }

    public T front(){
        if (isEmpty()){
            System.out.println("\033[31mQueue is empty!\033[0m");
            return null;}
        else
            return array.get(0);
    }

    public void print(){
        for (T temp : array){
            System.out.print(temp + "  ");
        }
        System.out.println();
    }

    public void clear(){
        array.clear();
    }

}
