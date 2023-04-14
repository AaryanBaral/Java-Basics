import java.util.*;


class ClearBit{
     public static void main(String args[]){
        // ************** FOR GET BIT WE PERFORM AND BIT MANIPULATION ******************* 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary bit: ");
        int bit = sc.nextInt();
        System.out.println("Enter the positionn to get from the b binary bit: ");
        int position = sc.nextInt();
        int BitMask = 1 << position;
        //  left shifting the 1 bit with the required position makes a number where the given position is 1 and all the remaining position is zero.
        BitMask = ~(BitMask);
        System.out.println(BitMask & bit);
        sc.close();
    }
}
