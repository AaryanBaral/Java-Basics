import java.util.*;


class Recursion{
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printCombo(String str, int idx, String newString){
        String CurrElement = keypad[str.charAt(idx)-'0'];
        for(int i = 0; i<CurrElement.length()-1;i++){
            printCombo(str, idx+1, newString+CurrElement.charAt(i));
        }
    }
     public static void main(String args[]){
        printCombo("23", 0, "");
    }
}