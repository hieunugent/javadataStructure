public class BST {
    class Node {
        int key;
        Node left, right;

        public Node(int item){
            key =item;
             left= right = null;
        }

    }

    Node root;
    BST(){
        root= null;}
    void insert(int key){
        root = insertRec(root, key);
    }
    Node insertRec(Node root, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        if (key < root.key){
            root.left = insertRec(root.left, key);
        }
        else if (key > root.key){
            root.right = insertRec(root.right, key);
        }
        return root;
    }
    void inorder(){

        System.out.println ( "In Order");
        inorderRec(root);
    }
    void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
    
    void preorder() {

        System.out.println("pre Order");
        preorderRec(root);
    }

    void preorderRec(Node root) {        
        if (root != null){
            System.out.println(root.key);
            if(root.left != null){
                preorderRec(root.left);
            }
            preorderRec(root.right);

        }
    }
    public static void main (String[] args){
        BST tree = new BST();
        tree.insert(7);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
      

        // print inorder traversal of the BST
        tree.inorder();
        tree.preorder();
    }
    
}
