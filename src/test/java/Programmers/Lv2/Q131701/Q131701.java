package Programmers.Lv2.Q131701;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.*;

public class Q131701 {

    public static Stream<Arguments> inputAndResult() {
        return Stream.of(
            arguments(new int[]{7, 9, 1, 1, 4}, 18)
        );
    }
}
