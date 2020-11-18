package polymorph;

public class C extends B{

    public C(){
        System.out.println("I am constructor C()");
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Class C: print()");
    }

    public void day(){
        System.out.println("Monday");
    }

    @Override
    public void drink() {
        System.out.println("Fanta mango");
    }
}
