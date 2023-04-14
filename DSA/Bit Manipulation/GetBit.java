import java.util.*;


class GetBit{
     public static void main(String args[]){
        // ************** FOR GET BIT WE PERFORM AND BIT MANIPULATION ******************* 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary bit: ");
        int bit = sc.nextInt();
        System.out.println("Enter the positionn to get from the b binary bit: ");
        int position = sc.nextInt();
        int BitMask = 1 << position;
        //  left shifting the 1 bit with the required position makes a number where the given position is 1 and all the remaining position is zero.
        if((BitMask & bit)==0){
            // if the bit mask is bit manipulated and with bit then all the other number will be zero except of the required position as we have only 1 in bit mask which is in the required position.
            // so if the required position has zero it givies all 0 bit result but if it has 1 bit then it gives 1 only in the required bit.
            System.out.println("Bit was 0");
        }
        else{
            System.out.println("bit was 1");
        }
        sc.close();
    }
}