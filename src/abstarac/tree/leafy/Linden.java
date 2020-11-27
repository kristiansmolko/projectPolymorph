package abstarac.tree.leafy;

import abstarac.Tree;

public class Linden extends Tree {
    public Linden(int age){
        super(age);
    }

    @Override
    public void description() {
        System.out.println("Not Dua Lipa, iba lipa");
    }
}
