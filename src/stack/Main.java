package stack;

public class Main {
    public static void main(String[] args) {
        StackE<Integer> zac = new StackE(4);
        zac.push(16);
        zac.push(16);
        zac.push(16);
        zac.print();
        zac.pop();
        zac.print();

        StackE<String> uniZac = new StackE<>(5);
    }
}
