package abstarac.tree.leafy;

import abstarac.Tree;

public class Oak extends Tree {
    public Oak (int age){
        super(age);
    }

    @Override
    public void description() {
        System.out.println("You killed in your first seconds in minecraft");
    }
}
