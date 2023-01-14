package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class FilteringOperationTest {

    @Test
    void testFilter() {
        Stream.of("Kahfi", "Kurnia", "Aji", "Fauzan", "Widi")
                .filter(name -> name.length() > 4)
                .forEach(System.out::println);

        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }

    @Test
    void testDistinct() {
        Stream.of("Kahfi", "Kurnia", "Kahfi", "Aji", "Fauzan", "Widi", "Fauzan")
                .distinct()
                .forEach(System.out::println);
    }
}
