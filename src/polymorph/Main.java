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
        ((B) p2).drink();

        A p3 = new A();
        p3.wildAnimal();

        I1 p4 = new B();
        p4.wildAnimal();

        C p5 = new C();
        p5.print();

        A p6 = new A("mobile phone");

        I1 p7 = new C();
        ((C)p7).print();

        B p8 = new C();
        p8.print();
        p8.time();

        I2 p9 = new C();
        p9.drink();
        ((C)p9).time();

        A p10 = new A();
        p10.time();

        M m = new M();
        m.start(p2);

    }
}
