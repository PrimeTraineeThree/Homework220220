package corejava.statments.iterative;

import java.util.Scanner;

public class ForLoopExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        for (int i = 0; i <= 10; i++) {

            System.out.println(num +  "  X " + i + " = " + num * i);

        }
    }
}
