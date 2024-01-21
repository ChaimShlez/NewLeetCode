public class Tree {
     protected   Node root;
     private int currentValue=0;

    public Tree() {
        this.root = null;
    }


    public void insert(int data) {
        if (root==null){
            this.root=new Node(data);
        }
        else {
            insert(root,data);
        }

    }

    private Node insert(Node root, int data) {
        if (root==null){
            return new Node(data);
        }
        else {
            if (data < root.getValue()){
                root.setLeft(insert(root.getLeft(), data));
            } else if ( data > root.getValue()) {
                root.setRight(insert(root.getRight(), data));
            }
        }
        return root;
    }

    public boolean isSame(Node root1,Node root2){
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.getValue() != root2.getValue()) {
            return false;
        }

        return isSame(root1.getLeft(), root2.getLeft()) && isSame(root1.getRight(), root2.getRight());

    }
    public boolean path(int target ,Node root){
        int sum=0;
        return pathSum(target, root,sum);
    }

    public boolean pathSum(int target,Node root,int sum){


        if (root.getLeft()==null&&root.getRight()==null) {
            sum = sum + root.getValue();
        }
          if (sum==target){
              return true;
          }


        return pathSum(target, root.getLeft(), sum+root.getValue())||pathSum(target, root.getRight(), sum+root.getValue());

    }

    public boolean symmetricTree(Node root){
        if (root == null ) {
            return true;
        }

        if (root.getLeft()!=null&& root.getRight()==null ||
                root.getLeft()==null&& root.getRight()!=null ) {
            return false;
        }

        return symmetricTree(root.getLeft()) && symmetricTree(root.getRight());

    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}
