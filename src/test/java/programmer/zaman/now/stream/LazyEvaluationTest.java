package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class LazyEvaluationTest {

    @Test
    void testTerminalOperation() {

        List<String> names = List.of("Kahfi", "Kurnia", "Aji");

        names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to UPPERCASE");
                    return name.toUpperCase();
                })
                .map(upper -> {
                    System.out.println("Change " + upper + " to Mr.");
                    return "Mr." + upper;
                })
                .forEach(System.out::println);
    }
}
