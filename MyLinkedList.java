import java.util.*;
import java.io.*;

public class MyLinkedList {
        Node head;
        static class Node{
            int data;
            Node next;

            Node(int d){
                data = d;
                next= null;
            }
        }
        public static MyLinkedList insert(MyLinkedList list, int data){
            // create the new node for data
            Node new__Node = new Node(data);
            new__Node.next= null;

            // if linkedlist is empty, 
            //then make the new node as the head
            if(list.head == null){
                list.head = new__Node;
            }else{
                //if not empty need to go to the end of the list and add it in
                Node last = list.head;
                while(last.next !=null){
                    last = last.next;
                }

                last.next = new__Node;
            }
            return list;


        }
        public static void printMyLinkedList (MyLinkedList list){
            Node curr__node = list.head;
            System.out.print("LinkedList: ");
            while(curr__node!= null){
                System.out.print(curr__node.data + " ");
                curr__node = curr__node.next;
            }
            System.out.println(" End List");
        }
        /// DELETE A NODE BY KEY
        public static MyLinkedList deletebyKey (MyLinkedList list, int key){
            // key in the head
            Node curr__node = list.head;
            Node prev = null;
            if (curr__node != null && curr__node.data==key){
                list.head = curr__node.next;
                System.out.println("Done delete " + key);
                return list;
            }
            // key not in the head if the current not does not null and the data not match key to be delete


            while(curr__node!=null && curr__node.data != key ){
                prev = curr__node;
                curr__node = curr__node.next;
            }

            if (curr__node != null){
                prev.next = curr__node.next;
                System.out.println("Done delete "+ key);
            }
            // key does not exit
            if ( curr__node == null){
                 System.out.println(key +" delete is not  found");
            }
            return list;
        }
        public static void main(String[] args){
                 MyLinkedList mylist = new MyLinkedList();

                    mylist= insert(mylist, 1);
                    mylist= insert(mylist, 2);
                    mylist= insert(mylist, 3);
                    mylist= insert(mylist, 4);

                    printMyLinkedList(mylist);
                    deletebyKey(mylist, 3);
                    printMyLinkedList(mylist);
                    deletebyKey(mylist, 1);
                    printMyLinkedList(mylist);
                    deletebyKey(mylist, 1);

    }

     }
       
    
