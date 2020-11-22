 class Qnode {
     int key;
     Qnode next;
    public Qnode(int key){
        this.key= key;
        this.next = null;
    }
}
    class QueueList{
        Qnode front, rear;
        public QueueList(){
            this.front= this.rear= null;

        }
        void enqueue(int key){
            Qnode temp = new Qnode(key);
            if(this.rear == null){
                this.front= this.rear = temp;
                return;
            }

            this.rear.next = temp;
            this.rear = temp;
        }

        void dequeue(){
            if(this.front == null){
                return;
            }
            Qnode temp = this.front;
            this.front = this.front.next;
            if (this.front == null){
                this.rear = null;
            }
        }
        
        public static void main(String[] args) {
            QueueList q = new QueueList();
            q.enqueue(10);
            q.enqueue(20);
            q.dequeue();
            q.dequeue();
            q.enqueue(30);
            q.enqueue(40);
            q.enqueue(50);
            q.dequeue();
            System.out.println("Queue Front : " + q.front.key);
            System.out.println("Queue Rear : " + q.rear.key);
        }
    }

