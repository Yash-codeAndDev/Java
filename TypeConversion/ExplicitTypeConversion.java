
/**
 * ExplicitTypeConversion
 */
public class ExplicitTypeConversion {

    public static void main(String[] args) {
        
        int a  = 130;
        byte b;
        System.out.println("a : " + Integer.toBinaryString(a));
        b = (byte)a;
        System.out.println("b : " + b); // -126 

        /*
            binary value of a : 000...0000 10000010 
            byte contain 8 bits threfore last 8 bit of a is taken : 10000010
            
            since MSB = 1 i.e -ve number therefore 2's complement is done of rest of bits(0000010)
            
            2's complement of 0000010 : 1111110

            now these bit are added to MSB(1) 

            resulting number : 11111110 = -126
        */

        double d =  10.9;
        int c = (int) d;
        System.out.println("c : "+c );
        /*
            double to integer ->
            10.8 -> 10 decimalis truncated  
        */
    }
}