class Queue {
    int front, rear, size;
    int capacity;
    int array[];


    public Queue (int capacity){
        this.capacity= capacity;
        this.size = 0;
        front= 0;
        rear= capacity-1;
        array = new int[this.capacity];
    }

    boolean isFull(Queue queue){
        return (queue.size ==  queue.capacity);
    }
    boolean isEmpty(Queue queue){
        return (queue.size == 0);
    }

    void enqueue(int item ){
        if(isFull(this)){
            return;
        }
        this.rear = (this.rear+1)% this.capacity;
        this.array[this.rear] = item;
        this.size = this.size+1;
        System.out.println(item + " Enqueue to Queue");
    }

    int dequeue(){
        if(isEmpty(this)) return Integer.MIN_VALUE;

        int item = this.array[this.front];
        this.front= (this.front + 1)%this.capacity;
        this.size = this.size -1;
        return item;

    }
    int front(){
        if(isEmpty(this))return Integer.MIN_VALUE;
        return this.array[this.front];
    }
    int rear(){
        if (isEmpty(this))
            return Integer.MIN_VALUE;
        return this.array[this.rear];
    }













    public static void main (String [] args)
    {
        Queue queue = new Queue(10);
        System.out.println(queue.front  +" " + queue.rear);
        queue.enqueue(10);
        System.out.println(queue.front +" "+ queue.rear);
        queue.enqueue(20);
        System.out.println(queue.front +" "+ queue.rear);
        queue.enqueue(30);
        System.out.println(queue.front + " " + queue.rear);
        queue.enqueue(40);
        System.out.println(queue.dequeue() + " Dequeue from queue" + queue.front);
        System.out.println(queue.front + " " + queue.rear + " "+ queue.array[0]);
        queue.enqueue(50);
        queue.enqueue(600);
        queue.enqueue(700);
        queue.enqueue(80);
        queue.enqueue(90);
        queue.enqueue(100);
        queue.enqueue(11);
        System.out.println(queue.dequeue() + " Dequeue from queue" + queue.front);

        queue.enqueue(12);
        
        queue.enqueue(13);


    }
}
// FIFO 
// Enqueue add item when Queue is full set overflow condition
// Dequeue remove item, item pop the same order of when they are push, if queue is empty Underflow condition
// Front get item in front
// rear get Item in last
