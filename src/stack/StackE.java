package stack;

import java.util.ArrayList;
import java.util.List;

public class StackE{
    private int capacity;
    private List<Integer> array;

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

    public void push(int value){
        if (isFull())
            System.out.println("Stack is full");
        else
            array.add(value);
    }

    public void pop(){
        if (isEmpty())
            System.out.println("Stack is empty");
        else
            array.remove(array.size()-1);
    }

    public int top(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return 0;}
        else
            return array.get(array.size()-1);
    }

    public void print(){
        for (Integer t : array)
            System.out.print(t + "  ");
        System.out.println();
    }

    public void clear(){
        array.clear();
    }
}
