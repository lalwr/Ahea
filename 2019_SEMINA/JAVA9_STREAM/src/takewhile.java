import java.util.stream.Stream;

public class takewhile {

    public static void main(String[] args) {


        Stream.of("a", "b", "c", "", "e", "f", "", "g").takeWhile(s -> !s.isEmpty()).forEach(System.out::print);

        System.out.println("\n-------");

        Stream.of("a", "b", "c", "", "e", "f", "", "g").dropWhile(s -> !s.isEmpty()).forEach(System.out::print);


    }
}
