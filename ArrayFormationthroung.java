class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
       int len = arr.length;
       int lenpiece = pieces.length;
        while(lenpiece > 0){
            if(!checkarray(arr, pieces[lenpiece -1]))
            {
                return false;
            }
            len -=pieces[lenpiece-1].length;
            lenpiece--;
        }
        return true;
        
        
        
    }
    
    
    public boolean checkarray(int[] arr, int[] subPiece){
        int match = subPiece.length;
        int i;
        for( i =0; i < arr.length; i++){
            if (arr[i] == subPiece[0]){
                break;
            }
        }
        int start = 0;
        while(match >0 ){
            if(i >= arr.length){
                return false;
            }
            if(arr[i] != subPiece[start]){
                return false;
            }
            match--;
            start++;
            i++;     
        }
        return true;
        
    }
}