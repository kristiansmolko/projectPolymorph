package polymorph;

public class B extends A implements I2{

    public B(){
        System.out.println("I am constructor B()");
    }

    @Override //anotacia
    public void print() {
        System.out.println("Class B: print()");
    }

}
