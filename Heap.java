 class Heap {

    // check the mid point of array to determind the leaf node
    // then the consider the parent node with their child 
    // if there is children greater swap it with the largest child
    // recursive with the the current swap children to see if there is more swap below
   static void heapify(int arr[], int n , int i){
        int largest = i;
        int l = 2*i +1;
        int r = 2*i +2;
        if (l < n && arr[l] > arr[largest]){ largest = l;}
        if(r <n && arr[r] > arr[largest]){ largest = r;}
        if(largest != i){
            int swap = arr[i];
            arr[i]= arr[largest];
            arr[largest]= swap;
            heapify(arr, n, largest);
        }
    }
    static void buildHeap(int arr[], int n ){
        int startIdx = (n/2)-1;

        for(int i = startIdx; i >= 0; i--){
            heapify(arr, n, i);
        }
    }
   
    static void printHeap(int arr[], int n ){
        System.out.println("Array that representation of the Heap is: ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main (String args[]){
        int[] arr = { 1, 2, 5, 4, 6, 13, 10, 9, 8, 15, 17};
        int n = arr.length;
        buildHeap(arr, n);
        printHeap(arr, n);
    }
}                                                                                                                                                                                                  