import java.lang.*; 
import java.util.*;
 class Solution {
    
    public static void main(String[] args) {
        // Write your code here

        Scanner sc=new Scanner(System.in);
        char c = sc.nextLine().charAt(0);        

      
        if(c >= 'a' && c <= 'z')
           {
               System.out.print("0");
           }
        else if(c >= 'A' && c <= 'Z')
        {
            System.out.print("1");
        }
        else
        {
            System.out.print("-1");
        }

    }
}