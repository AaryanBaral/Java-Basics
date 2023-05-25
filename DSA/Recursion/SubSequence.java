import java.util.HashSet;

public class SubSequence {

    public static void subsequence(String str, int index, String newString, HashSet<String> set){
        if(index == str.length()){
            if(set.contains(newString)){
                return;
            }
            set.add(newString);
            System.out.println(newString);
            return;
        }
        char currentElement = str.charAt(index);
        subsequence(str, index+1, newString+currentElement, set);
        subsequence(str, index+1, newString, set);
    }
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        subsequence("aaa", 0, "",set);
    }
}
