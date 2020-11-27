package abstarac;

public abstract class Tree {
    private int age;

    public Tree(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public abstract void description();

    public void getFruit(){
        System.out.println("Ziadne");
    }
}
