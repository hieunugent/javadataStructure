class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        boolean increase = false;
        boolean decrease = false;
        boolean turn = false;
        if (arr.length < 3){
            return false;
        }
        for (int i = 1 ; i < arr.length ; i++){
            if(arr[i] > arr[i-1] && !turn) {
                increase = true;
            }
            else if(arr[i]< arr[i-1] && !turn){
                turn = true;
                decrease = true;
            }
            else if (turn && arr[i] < arr[i-1]){
                decrease = true;
            }else{
                return false;
            }     
        }
        return increase&&decrease;
    }
}