public class DoubleLinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            data = d;
            prev = null;
            next= null;
        }
    }
    public static DoubleLinkedList insert(DoubleLinkedList list, int data){
        Node new__node = new Node(data);
        new__node.next = null;
        new__node.prev= null;

        if(list.head == null){
            list.head = new__node;
        }else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new__node;
            new__node.prev= last;

        }
        return list;
    }
    public static void travelser(DoubleLinkedList list){
            Node curr__node = list.head;
            System.out.print("Double list ");
            while(curr__node != null){
                System.out.print(curr__node.data+ " ");
                curr__node = curr__node.next;
            }
            System.out.println("");
    }
    public static DoubleLinkedList deleteNode( DoubleLinkedList list, int key){
        Node curr__node = list.head;
        if(curr__node != null && curr__node.data ==key){
            list.head = curr__node.next;
            System.out.print("Done delete " + key + "\n");
            return list;
        }
        while(curr__node != null && curr__node.data != key){
            
            curr__node = curr__node.next;
            
        }
        
        if(curr__node !=null){ 

            if (curr__node.next != null){
                curr__node.next.prev = curr__node.prev; 
                curr__node.prev.next = curr__node.next;
                curr__node.prev = null;
                curr__node.next = null;
            }
            else{
                //last node
                curr__node.prev.next = null;
                curr__node.prev = null;

            }
            

        
        }
        
        return list;


    }

    public static void main(String[] args){
        DoubleLinkedList list = new DoubleLinkedList();
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        travelser(list);
        deleteNode(list, 2);
        travelser(list);

    }

}
