package Programmers.Lv2;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ThirdWeekOfMay {
    // https://school.programmers.co.kr/learn/courses/30/lessons/77485
    public static Stream<Arguments> Q77485() {
        return Stream.of(
            arguments(6, 6, new int[][]{{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}}, new int[]{8, 10, 25}),
            arguments(3, 3, new int[][]{{1, 1, 2, 2}, {1, 2, 2, 3}, {2, 1, 3, 2}, {2, 2, 3, 3}}, new int[]{1, 1, 5, 3}),
            arguments(100, 97, new int[][]{{1, 1, 100, 97}}, new int[]{1})
        );
    }
    // https://school.programmers.co.kr/learn/courses/30/lessons/154540
    public static Stream<Arguments> Q154540() {
        return Stream.of(
            arguments(new String[]{"X591X","X1X5X","X231X", "1XXX1"}, new int[]{1, 1, 27}),
            arguments(new String[]{"XXX","XXX","XXX"}, new int[]{-1})
        );
    }
    // https://school.programmers.co.kr/learn/courses/30/lessons/86971
    public static Stream<Arguments> Q86971() {
        return Stream.of(
            arguments(9, new int[][]{{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}}, 3),
            arguments(4, new int[][]{{1, 2}, {2, 3}, {3, 4}}, 0),
            arguments(7, new int[][]{{1, 2}, {2, 7}, {3, 7}, {3, 4}, {4, 5}, {6, 7}}, 1)
        );
    }
    // https://school.programmers.co.kr/learn/courses/30/lessons/12936
    public static Stream<Arguments> Q12936() {
        return Stream.of(
            arguments(3, 5, new int[]{3, 1, 2})
        );
    }
    // https://school.programmers.co.kr/learn/courses/30/lessons/12978
    public static Stream<Arguments> Q12978() {
        return Stream.of(
            arguments(5, new int[][]{{1, 2, 1}, {2, 3, 3}, {5, 2, 2}, {1, 4, 2}, {5, 3, 1}, {5, 4, 2}}, 3, 4),
            arguments(6, new int[][]{{1, 2, 1}, {1, 3, 2}, {2, 3, 2}, {3, 4, 3}, {3, 5, 2}, {3, 5, 3}, {5, 6, 1}}, 4, 4)
        );
    }
    // https://school.programmers.co.kr/learn/courses/30/lessons/12905
    public static Stream<Arguments> Q12905() {
        return Stream.of(
            arguments(new int[][]{{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}}, 9),
            arguments(new int[][]{{0, 0, 1, 1}, {1, 1, 1, 1}}, 4)
        );
    }
}
