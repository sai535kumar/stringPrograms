package String_Problems;

import java.util.Scanner;

public class Count_Uppercase_Lowercase_Digit_SpecialCharacter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int upper=0,lower=0,digit=0,special=0;
        char[] charArr=str.toCharArray();
        for(int i=0;i<charArr.length;i++){
            // using Character class
//            if(Character.isDigit(charArr[i]))
//                digit++;
//            else if(Character.isUpperCase(charArr[i]))
//                upper++;
//            else if(Character.isLowerCase(charArr[i]))
//                lower++;
//            else
//                special++;
            //without using pre-defined methods
            if(charArr[i]>='0' && charArr[i]<='9')
                digit++;
            else if(charArr[i]>='A' && charArr[i]<='Z')
                upper++;
            else if(charArr[i]>='a' && charArr[i]<='z')
                lower++;
            else
                special++;
        }
        System.out.println("Upper case: "+upper);
        System.out.println("Lower case: "+lower);
        System.out.println("Digits: "+digit);
        System.out.println("Special characters: "+special);
    }
}
