package CollectionsExample.ListEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();

        for(int i = 0; i<10; i++){
            l1.add(i+1);
        }
        System.out.println("l1 = "+l1);
        l1.remove(2);
        System.out.println("l1 = "+l1);
    }
}
