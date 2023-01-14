package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.stream.Stream;

public class OrderingOperationTest {

    @Test
    void testSorted() {
        Stream.of("Kahfi", "Kurnia", "Aji", "Programmer", "Zaman", "Now")
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator() {
        Comparator<String> reverseComparator = Comparator.reverseOrder();

        Stream.of("Kahfi", "Kurnia", "Aji", "Programmer", "Zaman", "Now")
                .sorted(reverseComparator)
                .forEach(System.out::println);
    }
}
