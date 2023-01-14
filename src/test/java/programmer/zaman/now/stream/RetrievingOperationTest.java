package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.stream.Stream;

public class RetrievingOperationTest {

    @Test
    void testLimit() {
        Stream.of("Kahfi", "Kurnia", "Aji", "Fauzan", "Widi")
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        Stream.of("Kahfi", "Kurnia", "Aji", "Fauzan", "Widi")
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        Stream.of("Kahfi", "Edo", "Kurnia", "Aji", "Fauzan", "Widi")
                .takeWhile(name -> name.length() <= 5)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        Stream.of("Kahfi", "Edo", "Kurnia", "Aji", "Fauzan", "Widi")
                .dropWhile(name -> name.length() <= 5)
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        Optional<String> optional = Stream.of("Kahfi", "Edo", "Kurnia", "Aji", "Fauzan", "Widi")
                .findAny();

        optional.ifPresent(System.out::println);
    }

    @Test
    void testFindFirst() {
        Optional<String> optional = Stream.of("Kahfi", "Edo", "Kurnia", "Aji", "Fauzan", "Widi")
                .findFirst();

        optional.ifPresent(System.out::println);
    }
}
