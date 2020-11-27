package generic;

public class Main {
    public static void main(String[] args) {
        Algorithm alg = new Algorithm();
        AlgorithmG algg = new AlgorithmG();
        System.out.println(alg.add(15,20));
        System.out.println(alg.add(15.5,20.2));
        System.out.println(algg.add(15,16,17));
        algg.checkType("Ahoj");
    }
}
