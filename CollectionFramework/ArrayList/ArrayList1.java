package CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(2);
        l.add("A");
        l.add(5);
        l.add('c');
        l.add(12);
        l.add(null);
        System.out.println(l);
        System.out.println(l.get(0));
        System.out.println(l.get(2));
        System.out.println(l.get(3));
        System.out.println(l.get(5));
        Collections.sort(l);
        System.out.println(l);
        System.out.println();

    }
}
