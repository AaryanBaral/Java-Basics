import java.util.*;

public class Reverse{
    public static void reverseString(String s, int n){
        if(s.length()-1==n){
            System.out.println(s.charAt(n));
            return ;
        }
        reverseString(s, n+1);
        System.out.println(s.charAt(n));
        
    }
     public static void main(String args[]){
         
    }
}