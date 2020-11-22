public class BinarySearch {
     public static  int BinarySearch(int arr[], int target){
    
        int left= 0;
        int right= arr.length -1;
        int pivot = (right +left)/2;
        while (left < right){
            if(arr[pivot] == target){
                System.out.print("found the target: " + target + " at the position ");
                return pivot;
            }
            else if(arr[pivot] <  target){
                left = pivot;

            }else if (arr[pivot] >  target){
                right = pivot;
            }
            pivot = (left +right)/2;

        }
        return -1;
    }

    public static void main ( String [] args){
        int arr[] = new int[1000000];
        long startTime = System.nanoTime();
        for(int i = 0 ; i < arr.length ; i ++){
            arr[i] = i +1;
        }
        long endTime = System.nanoTime() - startTime;

        System.out.println("time build the array is: "+ endTime/1000000);

        startTime = System.nanoTime();
        int result = BinarySearch(arr, 1);
        endTime = System.nanoTime() - startTime;  
        System.out.println ("time to find a target is: "+ endTime/1000000);
        System.out.println(result);
       

    }
}
