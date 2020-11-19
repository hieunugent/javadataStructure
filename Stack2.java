import java.util.*;
class Stack{
    Queue<Integer> q1 = new LinkedList<>(), q2 = new LinkedList<>();
    int curr_size;
    public Stack(){
        curr_size = 0 ;
    }
    void remove(){
        if (q1.isEmpty()) return;

        while(q1.size() != 1){
            q2.add(q1.peek());
            q1.remove();
        }

        q1.remove();
        curr_size--;
           Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
        
    }
    int top(){
        if (q1.isEmpty()){
            return -1;
        }
        while(q1.size()!= 1){
            q2.add(q1.peek());
            q1.remove();
        }
        //last one
        int temp = q1.peek();
        q1.remove();
        q2.add(temp);


        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
        return temp;
    }
    int size(){

        return curr_size;
    }
    void add(int x){
        q1.add(x);
        curr_size++;

    }

    public static void main(String [] args){
        Stack s = new Stack();
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println(" current size : " + s.size());
        System.out.println("TOP "+ s.top());
 
           s.remove();
            System.out.println("REMOVE "+ s.top());

}}