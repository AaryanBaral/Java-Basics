import java.util.*;
public class Toh{
    public static void TowerOfHanoi(int n, String Src, String help, String des){
        if(n==1){
            System.out.println(" Disk "+n+" transfered from "+Src+" to "+des);
            return;
        }
        TowerOfHanoi(n-1,Src, des, help);
        System.out.println("Disk "+n+" transfered from "+Src+" to "+des);
        TowerOfHanoi(n-1,help,Src, des);
    }
     public static void main(String args[]){
        TowerOfHanoi(4,"S","H","D");
         Scanner sc = new Scanner(System.in);
        sc.close();
    }
}