package corejava;

public class ConstructorExample {
    int  a;
    String name;

    // user define zero arg constructor


    public ConstructorExample(int a, String name) {
        this.a = a;
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("This is main method");
        ConstructorExample ce = new ConstructorExample(10, "jay");
        System.out.println(ce.a);
        System.out.println(ce.name);
        ConstructorExample constructorExample = new ConstructorExample(20, "Amit");
        System.out.println(constructorExample.a);
        System.out.println(constructorExample.name);
    }


}
