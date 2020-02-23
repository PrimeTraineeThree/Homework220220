package corejava;

public class MorningChallenge {

    int age = 30;
    static String myName = "Amit";

    public static void main(String[] args) {
        MorningChallenge morningChallenge = new MorningChallenge();
        getMyAge();
        morningChallenge.getMyName();
    }

    public void getMyName(){
        System.out.println("This is from instance method");
        System.out.println(age);
        System.out.println(MorningChallenge.myName);
    }

    public static void getMyAge(){
        System.out.println("This is from static method");
        MorningChallenge morningChallenge = new MorningChallenge();
        System.out.println(myName);
        System.out.println(morningChallenge.age);
    }
}
