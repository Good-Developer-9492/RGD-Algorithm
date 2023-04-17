package Programmers.Lv2;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class ThirdWeekOfApril {

    public static Stream<Arguments> Q84512() {
        return Stream.of(
            Arguments.arguments("AAAAE", 6),
            Arguments.arguments("AAAE", 10),
            Arguments.arguments("I", 1563),
            Arguments.arguments("EIO", 1189)
        );
    }

    public static Stream<Arguments> Q1844() {
        return Stream.of(
            Arguments.arguments(
                new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}},
                11),
            Arguments.arguments(
                new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}},
                -1)
        );
    }

    public static Stream<Arguments> Q17686() {
        return Stream.of(
            Arguments.arguments(
                new String[]{"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"},
                new String[]{"img1.png", "IMG01.GIF", "img02.png", "img2.JPG", "img10.png", "img12.png"}),

            Arguments.arguments(
                new String[]{"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"},
                new String[]{"A-10 Thunderbolt II", "B-50 Superfortress", "F-5 Freedom Fighter", "F-14 Tomcat"})
        );
    }

    public static Stream<Arguments> Q17679() {
        return Stream.of(
            Arguments.arguments(4, 5, new String[]{"CCBDE", "AAADE", "AAABF", "CCBBF"}, 14),
            Arguments.arguments(6, 6, new String[]{"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"}, 15)
        );
    }

    public static Stream<Arguments> Q12900() {
        return Stream.of(
            Arguments.arguments(4, 5)
        );
    }

}
