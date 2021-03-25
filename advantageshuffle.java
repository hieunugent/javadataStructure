// sorted array A and B in another version
// assigned[b] = list of that are assigned to beat b
// remainning = list of that are not assigned to any b
// populate(assigned, remaining) appropriately
// sortedB[j] is always the smallest unassigned element in B 
// reconstruct teh answer form annotations(assigned, remaining)  
////if there is some a assigned to b ....
import java.io.*;
import java.util.*;

import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.Deque;

class Solution{
    public int[] advantageCount(int[] A, int[] B){
        int [] sortedA = A.clone();
        int [] sortedB = B.clone();
        sortedA = Arrays.sort(sortedA);
        sortedB = Arrays.sort(sortedB);

        Map<Integer, Deque<Integer>> assigned = new HashMap();
        for (int b : B){
            assigned.put(b, new LinkedList());

        }
        Deque<Integer> remaining = new LinkedList();

        int j =0;
        for(int a : sortedA){
            if (a> sortedB[j]){
                assigned.get(sortedB[j++]).add(a);
            }
            else{
                remaining.add(a);
            }
        }
        int[] ans = new int[B.length];
        for(int i = 0; i < B.length; i++){
            if(assigned.get(B[i]).size()> 0){
                ans[i] = assigned.get(B[i]).pop();
            }else{
                ans[i] = remaining.pop();
            }
        }
    }
}