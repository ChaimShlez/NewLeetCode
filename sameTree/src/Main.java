public class Main {
    public static void main(String[] args) {
        Tree tree1=new Tree();
        tree1.insert(20);
        tree1.insert(2);
        tree1.insert(1);
        System.out.println(tree1);




        Tree tree2=new Tree();
        tree2.insert(50);
        tree2.insert(30);
        tree2.insert(60);
        System.out.println(tree2);
        Tree tree=new Tree();

        System.out.println( tree1.symmetricTree(tree1.root));

        System.out.println(tree.isSame(tree1.root,tree2.root));


        System.out.println(  tree1.path(23,tree1.root));


    }
}
