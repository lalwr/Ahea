import java.util.ArrayList;

public class LocalVariable {

    public static void main(String[] args) {


        //String message = "Ahea";


        var message = "Hello, Java 10";
        if(message instanceof String){
            System.out.println("message is String");
        }
        //message is String


//        var n; // error: cannot use 'var' on variable without initializer
//
//        var isNull = null; // error: variable initializer is 'null'
//
//        var length = (String s) -> s.length() > 10; // error: lambda expression needs an explicit target-type
//
//        var numbers = { 1, 2, 3 }; // error: array initializer needs an explicit target-type



        var result = LocalVariable.study();



        var empty = new ArrayList<>();
        if(empty instanceof Object){
            System.out.println("empty is Object");
        }
        //empty is Object


        var obj = new Object() {};

        //obj = new Object() {};



    }

    private static String study() {
        return "ahea";
    }
}


