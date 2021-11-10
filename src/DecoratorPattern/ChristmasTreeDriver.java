package DecoratorPattern;

import sun.reflect.generics.tree.Tree;

public class ChristmasTreeDriver {
    public static void main(String[] args) {

        ChristmasTree tree1 = new NobleFir();
        System.out.println(tree1.describe());

        ChristmasTree tree2 = new TreeTopper(new Baubles(new NorwaySpruce()));
        System.out.println(tree2.describe());
    }
}
