package Programmers.Lv2.Q169199;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class Test {
    public static Stream<Arguments> testcase() {
        return Stream.of(
            Arguments.arguments(new String[]{"...D..R", ".D.G...", "....D.D", "D....D.", "..D...."}, 7),
            Arguments.arguments(new String[]{".D.R", "....", ".G..", "...D"}, -1)
        );
    }
}
