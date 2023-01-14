package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByTest {

    @Test
    void testGroupingBy() {
        Map<String, List<Integer>> collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(Collectors.groupingBy(number -> number > 5 ? "Besar" : "Kecil"));

        System.out.println(collect);
    }

    @Test
    void testGroupingBy2() {
        Map<String, List<String>> map = Stream.of("Kahfi", "Kurnia", "Aji", "Fauzan", "Widi")
                .collect(Collectors.groupingBy(name -> name.length() > 5 ? "Panjang" : "Pendek"));

        System.out.println(map);
    }

    @Test
    void testPartitioningBy() {
        Map<Boolean, List<Integer>> collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(Collectors.partitioningBy(number -> number > 5));

        System.out.println(collect);
    }

    @Test
    void testPartitioningBy2() {
        Map<Boolean, List<String>> map = Stream.of("Kahfi", "Kurnia", "Aji", "Fauzan", "Widi")
                .collect(Collectors.partitioningBy(name -> name.length() > 5));

        System.out.println(map);
    }
}
