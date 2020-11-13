package polymorph;

public class Main {
    public static void main(String[] args) {
        B p1 = new B();
        p1.print();
        p1.wildAnimal();

        A p2 = new C();
        p2.print();
        p2.animal();
        ((B)p2).programmingLanguage();

        A p3 = new A();
        p3.wildAnimal();

        I1 p4 = new B();
        p4.wildAnimal();

        C p5 = new C();
        p5.print();

        A p6 = new A("mobile phone");

    }
}
