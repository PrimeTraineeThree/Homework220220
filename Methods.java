package corejava;

import java.util.Scanner;

public class Methods {


    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter the value of first number ");
        a = scan.nextInt();
        System.out.println("Enter the value of second number");
        b = scan.nextInt();
       Methods cal = new Methods();
        System.out.println("This is the boolean method");
        System.out.println(cal.isResulted(true));
       int result = cal.addition(a, b);
        System.out.println(result);
       subtraction(a, b);

    }

    public int addition(int a, int b){
        int result = a+b;
        return result;
    }

    public Methods thisIsObject(){
        Methods t = new Methods();
        return t;
    }

    public static void subtraction(int a, int b){
        int result = a-b;
        System.out.println(result);
    }

    public boolean isResulted(boolean value){
        return value;
    }


}
