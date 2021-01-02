import java.util.*;

class Program {
  public int[] arrayOfProducts(int[] array) {
		int[] result =  new int[array.length];

	
    // Write your code here.
		for(int i = 0; i < array.length ; i++){
			if( i == 0){
				result[i] = productof(1, array.length -1, array);
			}else if ( i == array.length-1){
				result[i] = productof(0, i-1, array);
			}else if (array.length >3){
				result[i] = productof(0,i-1, array) * productof(i+1,array.length -1, array );
			}else {
		
				result[i] = array[0]*array[2];
			}
			
		}
		
		
		
    return result;
  }
	public int productof(int start, int end, int[] array){
		int result = array[start];
		for (int i = start+1; i <= end ; i++){
			result *= array[i];
		}
	return result;
	}
}
