abstract class MyClass<T>{
    public MyClass(T t) {

    }

    public MyClass() {

    }

    abstract T test(T num, T num2);
}

public class Ahea {

    public static void main(String[] args) {

        MyClass<Integer> intHandler = new MyClass<>(10) {
            @Override
            Integer test(Integer num, Integer num2) {
                return null;
            }
        };

        MyClass<?> handler = new MyClass<>("One hundred") {
            @Override
            String test(String num, String num2) {
                return null;
            }
        };

        MyClass<Integer> obj = new MyClass<>() {
            Integer test(Integer x, Integer y) {
                return x+y;
            }
        };


    }
}
