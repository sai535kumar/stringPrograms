package String_Problems;

public class Fibonacci_Series {
    public static void main(String args[]){
        int a=0,b=1,c=0;
        int n=9720;
        System.out.print(a+" "+b);
        while(true){
            c=a+b;
            if(c>=n)
                break;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
