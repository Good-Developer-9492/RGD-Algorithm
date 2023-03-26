package Programmers.Lv2.Q42577;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Q42577 {
    public static Stream<Arguments> inputAndResult() {
        return Stream.of(
            arguments(new String[]{"119", "97674223", "1195524421"}, false),
            arguments(new String[]{"123", "456", "789"}, true),
            arguments(new String[]{"12", "123", "1235", "567", "88"}, false)
        );
    }
}
