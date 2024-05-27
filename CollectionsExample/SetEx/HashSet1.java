package CollectionsExample.SetEx;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSet1 {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);
        set.add(5);
        set.add(7);
        System.out.println("set => "+set);
        System.out.println("Size Of Set : "+set.size());
        System.out.println("Set Elements : ");
        for (Integer val : set){
            System.out.print(val+" ");
        }
        System.out.println();

        int element = 10;
        if (set.contains(element)){
            System.out.println(element+" exist in set");
        }else {
            System.out.println(element+" dosen't exist in set");
        }

        /*
            Set<Integer> set1 = new HashSet<>(){
                {
                    add(12);
                    add(31);
                    add(18);
                }
            };
            Another method to add elements in Set
        */

        Set<Integer> set1 = new HashSet<>(Arrays.asList(12,31,18));
        System.out.println("set1 => "+set1);

        set.addAll(set1);
        System.out.println("set => "+set);

        Set<Integer> set2 = new HashSet<>(3);
        set2.addAll(set);
        System.out.println("set2 => "+set2);

        Random rand = new Random();
        int val = rand.nextInt(20,50);
    }
}
