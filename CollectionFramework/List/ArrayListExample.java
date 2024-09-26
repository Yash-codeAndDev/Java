import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListExample 
{
    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=1; i<=10;i++)
        {
            arr.add(i);
        }

        /*
        
            # Itterating ArrayList 
 
            ListIterator itr= arr.listIterator();
            while(itr.hasNext()){
                System.out.println((Integer)itr.next());
            }
        */
        
        /*  
            # Itterating ArrayList in reverse order 
 
            ListIterator itr= arr.listIterator(arr.size());
            while(itr.hasPrevious()){
                System.out.println("Index : "+(Integer)itr.previousIndex());
                System.out.println("Element : "+(Integer)itr.previous());
            }
        */

    }   

}