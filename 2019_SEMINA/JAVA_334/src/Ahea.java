abstract class MyClass<T>{
    public MyClass(T t) {

    }

    public MyClass() {

    }

}

public class Ahea {

    public static void main(String[] args) {


        MyClass<Integer> handle1 = new MyClass<>(10) {
            // Anonymous Class
        };


        MyClass<Integer> handle2 = new MyClass<>() {
            // Anonymous Class
        };


    }
}
