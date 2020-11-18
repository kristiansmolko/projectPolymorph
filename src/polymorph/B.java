package polymorph;

public class B extends A implements I2{

    public B(){
        System.out.println("I am constructor B()");
    }

    @Override //anotacia
    public void print() {
        System.out.println("Class B: print()");
    }

    @Override
    public void wildAnimal() {
        System.out.println("Fox");
    }

    public void programmingLanguage(){
        System.out.println("Class B loves Java");
    }

    @Override
    public void drink() {
        System.out.println("Coca Cola Zero");
    }
}
