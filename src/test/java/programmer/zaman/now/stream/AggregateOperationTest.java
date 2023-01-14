package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.stream.Stream;

public class AggregateOperationTest {

    @Test
    void testMax() {
        Stream.of("Kahfi", "Kurnia", "Aji", "Programmer", "Zaman", "Now")
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testMin() {
        Stream.of("Kahfi", "Kurnia", "Aji", "Programmer", "Zaman", "Now")
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testCount() {
        long count = Stream.of("Kahfi", "Kurnia", "Aji", "Programmer", "Zaman", "Now")
                .count();
        System.out.println(count);
    }

    @Test
    void testSum() {
        Integer result = Stream.of(1, 2, 3, 4, 5)
                .reduce(0, Integer::sum);

        System.out.println(result);
    }

    @Test
    void testFactorial() {
        Integer factorial = Stream.of(1, 2, 3, 4, 5)
                .reduce(1, (value, item) -> value * item);

        System.out.println(factorial);
    }
}
