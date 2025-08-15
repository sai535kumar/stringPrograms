package String_Problems;

import java.util.Scanner;

public class Occurrences_of_character {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        char target_char='t';
        int count =0;
        char[] strArr=str1.toCharArray();
        for(int i=0;i<strArr.length;i++){
            if(strArr[i]==target_char)
                count++;
        }
        if(count==0)
            System.out.println(target_char+" is not found in the given string");
        else
            System.out.println("Occurrence of "+target_char+" is: "+count);
    }
}
