package String_Problems;

import java.util.Scanner;

public class Characters_in_String {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        //find length using in built function
        System.out.println(str1.length());
        //find length without using in built function
        char[] strArr=str1.toCharArray();
        int count=0;
        for(char s:strArr)
            count++;
        System.out.println(count);
    }
}
