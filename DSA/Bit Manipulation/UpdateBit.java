import java.util.*;


class UpdateBit{
     public static void main(String args[]){
        //  For Updating Bit From 1 to 0 we use clear Bit 
        //  For updating 0 to 1 ew use set Bit]
        // ************** FOR GET BIT WE PERFORM AND BIT MANIPULATION ******************* 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary bit: ");
        int bit = sc.nextInt();
        System.out.println("Enter the positionn to get from the binary bit: ");
        int position = sc.nextInt();
        System.out.println("Enter the bit value to be updated from the binary bit: ");
        int updateBit = sc.nextInt();
        int BitMask = 1 << position;
        if(updateBit==0){
            int notBitMAsk = ~(BitMask);
            System.out.println(notBitMAsk & bit);
        }
        else{
            System.out.println(BitMask | bit);
        }
 
        sc.close();
    }
}