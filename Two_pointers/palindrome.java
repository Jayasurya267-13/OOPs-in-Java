//palindrome or not

import java.util.*;

class palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                System.out.print("Not a Palindrome");
                break;
            }
            left++;
            right--;
        }
        System.out.print("Palindrome");
    }
}