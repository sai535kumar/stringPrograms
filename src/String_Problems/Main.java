package String_Problems;// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class parent{
public void show() {
    System.out.println("Method overriding");
}
}
class Child extends parent{
    public void show(){
        System.out.println("Method overriding");
    }
    public void overloading(int a, int b){
        System.out.println("Sum is: "+ (a+b));
    }
    public void overloading(int a, int b,int c){
        System.out.println("Sum is: "+(a+b+c));
    }
}
public class Main {
    public static void main(String[] args) {
        Child ch=new Child();
        ch.show();
        ch.overloading(1,2);
        ch.overloading(1,2,3);

    }
}