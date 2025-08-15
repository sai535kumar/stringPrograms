package String_Problems;

import java.util.Scanner;

public class Reverse_Each_Word {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String[] strArr=str1.split(" ");
        for(int i=0;i<strArr.length;i++){
            char[] chArr=strArr[i].toCharArray();
            int left=0,right=chArr.length-1;
            while(left<right){
                char temp=chArr[left];
                chArr[left]=chArr[right];
                chArr[right]=temp;
                left++;
                right--;
            }
            System.out.print(String.valueOf(chArr)+" ");
        }
    }
}
