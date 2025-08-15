package String_Problems;

import java.util.Scanner;

public class Reverse_string {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        char[] charArr=str1.toCharArray();
        int left=0,right=charArr.length-1;
        while(left<right){
            char temp=charArr[left];
            charArr[left]=charArr[right];
            charArr[right]=temp;
            left++;
            right--;
        }
        System.out.println(String.valueOf(charArr));
    }
}
