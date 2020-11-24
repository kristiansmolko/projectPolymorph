package stack;

public class Main {
    public static void main(String[] args) {
        StackE<Integer> zac = new StackE(4);
        try {
            zac.push(16);
            zac.push(16);
            zac.push(16);
            zac.push(15);
            zac.push(15);
            zac.print();
            zac.pop();
            zac.print();
        }catch(StackException ex){
            ex.printStackTrace();
        }
/*
        Queue<String> stringQ = new Queue<>(5);
            stringQ.enqueue("Prvy");
            stringQ.enqueue("Druhy");
            stringQ.enqueue("Treti");
            stringQ.enqueue("Stvrty");
            stringQ.enqueue("Piaty");
            stringQ.dequeue();
            stringQ.print();
            stringQ.enqueue("Ano");
            stringQ.print();
            System.out.println(stringQ.front());*/

    }
}
