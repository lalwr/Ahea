import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class JAVA9_OPTIONAL {

    @Test
    public void JAVA_OR() {

        Optional value = Optional.empty().or(() ->  Optional.of("Ahea"));

        System.out.println(value);
        //Optional[Ahea]

    }

    @Test
    public void JAVA_ifPresentOrElse() {

        Optional.empty().ifPresentOrElse(
                v -> System.out.println("Ahea"),
                () -> System.out.println("Not Ahea")
        );

        // Not Ahea

    }

    @Test
    public void JAVA_STREAM() {

        Stream<Optional<String>> optional =
                Stream.of(Optional.of("hyungJin"), Optional.of("minSu"), Optional.empty(), Optional.of("sungHyeon"));

        List<String> names = optional
                .flatMap(Optional::stream)
                .collect(Collectors.toList());

        System.out.println(names);
        //[hyungJin, minSu, sungHyeon]

    }


}
