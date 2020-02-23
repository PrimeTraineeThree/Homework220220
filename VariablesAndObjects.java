package corejava;

public class VariablesAndObjects {
    //instance variables or global variables
     int a=20;
     int b=10;
     String name = "Prime";
     String name1 = "Testing";
    // static variables global variables
      static int e =500;
      static String f ="India";

    //static method
    public static void main(String[] args) {
        //local variables
        int c =20;
        String d ="Hello";
        //accessing static variables in static are
        System.out.println(e);
        System.out.println(f);
        //object creation, accessing instance variables in static are
        VariablesAndObjects obj= new VariablesAndObjects();
        System.out.println(obj.a);
        System.out.println(obj.name);
    }

    //instance method
    public void instanceMethod( ) {
   // instace area
        System.out.println(b);
        System.out.println(name);

        //accessing static variables into instance are
        System.out.println(VariablesAndObjects.e);
        System.out.println(VariablesAndObjects.f);

    }


   public static void staticMethod()   {
      //static area
       VariablesAndObjects obj = new VariablesAndObjects();
       System.out.println(obj.name);
   }

}
