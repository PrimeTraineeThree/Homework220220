package corejava;

public class VariablesCalling {
    int a=10;
    static int b =20;
    int c;


    //static method
    public static void main(String[] args) {
        int a =9;
        //creation of object
        VariablesCalling obj = new VariablesCalling();

        System.out.println(obj.a);
        System.out.println(b);


    }

    //instance method
    public void test(){
        int c =11;
        System.out.println(a);
        System.out.println(VariablesCalling.b);
    }


}
