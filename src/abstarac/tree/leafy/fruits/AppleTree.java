package abstarac.tree.leafy.fruits;

import abstarac.Tree;

public class AppleTree extends Tree {
    public AppleTree(int age){
        super(age);
    }

    @Override
    public void description() {
        System.out.println("Sladke jablcka chces? Ani Eva neodolala");
    }

    @Override
    public void getFruit() {
        System.out.println("Sladke jablcka pre Evicku");
    }
}
