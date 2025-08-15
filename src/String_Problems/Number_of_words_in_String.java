package String_Problems;

import java.util.Scanner;

public class Number_of_words_in_String {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String[] strs=str1.split(" ");
        System.out.println(strs.length);
    }
}
