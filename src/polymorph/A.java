package polymorph;

public class A implements I1 {
    private int number;

    public A(){
        System.out.println("I am constructor A()");
        number = 40;
    }

    public A(String text){
        this();
        System.out.println("I am constructor A() and I got a text: " + text);
    }

    public A(String text, String name){
        this(text);
        System.out.println("I am constructor A() and I got text: " + text + " and a name: " + name);
    }

    @Override
    public void animal() {
        System.out.println("Cat");
    }

    public void print(){
        System.out.println("Class A: print()");
    }

    public void time(){
        System.out.println("Time: 10:20:20");
        M m = new M();
        m.run(this);
    }
}
