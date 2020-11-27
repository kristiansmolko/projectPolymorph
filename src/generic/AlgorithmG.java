package generic;

import java.util.Random;

public class AlgorithmG<T> {
    public T add (T a, T b, T c){
        Random rnd = new Random();
        int index = rnd.nextInt(3);
        return switch (index) {
            case 0 -> a;
            case 1 -> b;
            case 2 -> c;
            default -> null;
        };
    }

    public void checkType(T obj){
        if (obj instanceof Number){
            System.out.println("It is a number");
        }
        else if (obj instanceof String){
            System.out.println("It is ");
        }
        else System.out.println("Unknown type: " + obj.getClass());
    }
}
