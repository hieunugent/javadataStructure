import java.util.ArrayList;

public class HashNode<K, V>{
     // create the hash code
     K key;
     V value;

     HashNode<K,V> next;

     //constructor 
     public HashNode(K key, V value){
          this.key = key;
          this.value = value;
     }

}

public class Map<K, V>{
     private ArrayList<HashNode<K,V>> bucketArray;

     private int numBuckets;
     private int size;


     public Map(){
          bucketArray = new ArrayList<>();
          numBuckets = 10;
          size = 0;
          // create empty chaines
          for (int i  = 0 ; i < numBuckets; i++){
               bucketArray.add(null);
          }
     }
     public int size(){return size;}
     public boolean isEmpty() { return size()== 0;}
     // find the index for key
     public int getBucketIndex(K key){
          int hashCode = key.hashCode();
          int index = hashCode % numBuckets;
          return index;
     }
     public V remove(K key){
          int bucketIndex  =getBucketIndex(key);

          HashNode<K, V> head = bucketArray.get(bucketIndex);


          HashNode<K, V> prev = null;

          while(head != null){
               if (head.key.equals(key)){
                    break;
               }
               prev = head;
               head = head.next;
          }
          if(head == null)return null;

          size--;

          if(prev != null)
               prev.next = head.next;
          else
               bucketArray.set(bucketIndex, head.next);
          
          return head.value;

     }


     public static void main(String[] args){
          Map<String, Integer> map = new Map<>();
          map.add("this", 1);
          map.add("code", 2);
          map.add("this", 4);
          map.add("hi", 5);

     }

}
