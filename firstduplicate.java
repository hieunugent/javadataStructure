import java.util.*;

class Program {

  public int firstDuplicateValue(int[] array) {
    // Write your code here.
		HashSet<Integer> map = new HashSet<Integer>();

		
		for (int i = 0; i < array.length ; i++){
			if(map.contains(array[i])){
				return array[i];
			}else{
					map.add(array[i]);
			}
		
		}
    return -1;
  }
}