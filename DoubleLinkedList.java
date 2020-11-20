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

        }
        return list;
    }


}
