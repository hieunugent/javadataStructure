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

        System.out.println ( "\n In Order");
        inorderRec(root);
    }
    void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.print(root.key+ " ");
            inorderRec(root.right);
        }
    }
    
    void preorder() {

        System.out.println("\n pre Order");
        preorderRec(root);
    }

    void preorderRec(Node root) {        
        if (root != null){
            System.out.print(root.key+ " ");
            if(root.left != null){
                preorderRec(root.left);
            }
            preorderRec(root.right);

        }
    }
    void postorder(){
        System.out.println("\n post order");
        postorderRec(root);
    }
    void postorderRec(Node root){
        if (root != null){
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key+ " ");
        }
       

    }
    void deleteKey(int key){
        root = deleteRec(root,key);
    }
    Node deleteRec(Node root, int key){

        if(root == null) return root;
        if (key < root.key){
            root.left = deleteRec(root.left, key);
        }
        else if (key > root.key){
            root.right = deleteRec(root.right, key);
        }
        // if found the key meaning that key is on the root now
        else{
            if (root.left == null)
                  return root.right;
            else if (root.right == null){
                  return root.left;
            }

            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }
    int minValue(Node root){
        int minv = root.key;
        while(root.left != null){
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }
    int maxValue(){
        int max = root.key;
        while(root.right != null){
            max = root.right.key;
            root = root.right;
        }
        return max;
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
        System.out.println("Inorder traversal of the given tree");
        tree.inorder();

        System.out.println("\nDelete 20");
        tree.deleteKey(20);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();

        System.out.println("\nDelete 30");
        tree.deleteKey(30);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();

        System.out.println("\nDelete 50");
        tree.deleteKey(50);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();
        int value = tree.maxValue();
        System.out.println("\nmax value of the tree " + value);
    }
    
}
