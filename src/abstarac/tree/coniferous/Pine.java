package abstarac.tree.coniferous;

import abstarac.Coniferous;
import abstarac.Tree;

public class Pine extends Tree implements Coniferous {
    public Pine (int age){
        super(age);
    }

    @Override
    public void description() {
        System.out.println("Picham");
    }

}
