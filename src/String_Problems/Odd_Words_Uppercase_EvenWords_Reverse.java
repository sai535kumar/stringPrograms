package String_Problems;
import java.util.Scanner;

public class Odd_Words_Uppercase_EvenWords_Reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[]  strArr=str.split(" ");
        for(int i=0;i<strArr.length;i++){
            if((i+1)%2!=0)
                System.out.print(strArr[i].toUpperCase()+" ");
            else{
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
}
