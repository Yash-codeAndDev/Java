import java.util.*;
import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {
        
        HashSet<Object> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(11);
        set.add(3); // returns false
        set.add(9);
        set.add(null);
        set.add(11);
        set.add(null);
        
        System.out.println(set);

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,2,4,5,null,null));
        HashSet<Integer> set2  = new HashSet<>(arr);
        
        /* 
            for(int element : set2){
                System.out.println(element); 
            }
        */

        
    }
    
}