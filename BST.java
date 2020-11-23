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
    void postorder(){
        System.out.println("post order");
        postorderRec(root);
    }
    void postorderRec(Node root){
        if (root != null){
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.println(root.key);
        }
       

    }
    public static void main (String[] args){
        BST tree = new BST();
        tree.insert(30);
        tree.insert(10);
        tree.insert(20);
        tree.insert(40);
        tree.insert(50);
        tree.insert(60);
        tree.insert(55);
        tree.insert(5);
        // print inorder traversal of the BST
        tree.inorder();
        tree.preorder();
        tree.postorder();
    }
    
}
