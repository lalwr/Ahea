import java.util.stream.IntStream;
import java.util.stream.Stream;

public class takewhile {

    public static void main(String[] args) {


        Stream.of("a", "b", "c", "", "e", "f", "", "g").takeWhile(s -> !s.isEmpty()).forEach(System.out::print);
        //abc

        System.out.println("\n-------");

        Stream.of("a", "b", "c", "", "e", "f", "", "g").dropWhile(s -> !s.isEmpty()).forEach(System.out::print);
        //efg

        System.out.println("-------");

        IntStream.iterate(2, x -> x < 10, x -> x+ 2).forEach(System.out::print);
        //2 4 6 8

        System.out.println("-------");

        long count = Stream.ofNullable(99).count();
        System.out.println(count);
        // 1

        count = Stream.ofNullable(null).count();
        System.out.println(count);
        // 0


    }
}
