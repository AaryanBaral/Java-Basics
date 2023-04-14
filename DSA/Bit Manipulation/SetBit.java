import java.util.*;


class SetBit{
     public static void main(String args[]){
        // ************** FOR SET BIT WE PERFORM OR BIT MANIPULATION ******************* 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary bit: ");
        int bit = sc.nextInt();
        System.out.println("Enter the positionn to get from the b binary bit: ");
        int position = sc.nextInt();
        int BitMask = 1 << position;
        int newNumber = BitMask | bit;
        System.out.println(newNumber);
        sc.close();
    }
}