public class MaxHeap {
   private int[] Heap;
    private int size;
    private int maxsize;
    public MaxHeap(int maxsize){
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize+1];
        Heap[0]= Integer.MAX_VALUE;
    }
    // the key of maxheap is the insert and extract node
    // when insert a node at the leaf consider it with their parent move up when it greater then parent until it done
    // when extract a max node, call the Maxheapify,change value of root node with the leafnode to push back the node until it satisfy the maxheap 
    private int parent(int pos){
        return pos/2;
    }
    private int leftChild(int pos){
        return pos*2;
    }
    private int rightChild(int pos){
        return pos*2 +1;
    }
    private boolean isleaf(int pos){
        if (pos >= size/2 && pos < size) return true;

        return false;
    }

    private void swap(int fpos, int spos){
        int temp;
        temp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = temp;
    }
    private void maxHeapify(int pos){
        if(isleaf(pos)){
            return;
        }
        if(Heap[pos] < Heap[leftChild(pos)] || Heap[pos] < Heap[rightChild(pos)]){
            if(Heap[leftChild(pos)]  > Heap[rightChild(pos)]){
                swap(pos, leftChild(pos));
                maxHeapify(leftChild(pos));
            }else{
                swap(pos, rightChild(pos));
                maxHeapify(rightChild(pos));
            }
        }
    }

    private void insert(int element){
        Heap[++size] = element;
        int current = size;
        while(Heap[current] > Heap[parent(current)]){
            swap(current, parent(current));
            current = parent(current);
        }
    }
    public void print(){
        for(int i = 1; i <= size/2; i++){
            System.out.print("PARENT : "+ Heap[i] + " LEFT CHILD: "+ Heap[2*i]+ " Right CHILD: " + Heap[2*i +1]);
            System.out.println();
        }
    }
    public int extractMax(){
        int popped = Heap[1];
        Heap[1] = Heap[size--];
        maxHeapify(1);
        return popped;
    }
    public static void main(String[] arg) {
        System.out.println("The Max Heap is ");
        MaxHeap maxHeap = new MaxHeap(15);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);

        maxHeap.print();
        System.out.println("The max val is " + maxHeap.extractMax());
        maxHeap.print();
    }
}
