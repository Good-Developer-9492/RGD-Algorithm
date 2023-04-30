package Programmers.Lv2;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SecondWeekOfMay {
    //https://school.programmers.co.kr/learn/courses/30/lessons/178870
    public static Stream<Arguments> Q178870() {
        return Stream.of(
            arguments(new int[]{1, 2, 3, 4, 5}, 7, new int[]{2, 3}),
            arguments(new int[]{1, 1, 1, 2, 3, 4, 5}, 5, new int[]{6, 6}),
            arguments(new int[]{2, 2, 2, 2, 2}, 6, new int[]{0, 2})
        );
    }

    //https://school.programmers.co.kr/learn/courses/30/lessons/118667
    public static Stream<Arguments> Q118667() {
        return Stream.of(
            arguments(new int[]{3, 2, 7, 2}, new int[]{4, 6, 5, 1}, 2),
            arguments(new int[]{1, 2, 1, 2}, new int[]{1, 10, 1, 2}, 7),
            arguments(new int[]{1, 1}, new int[]{1, 5}, -1)
        );
    }

    //https://school.programmers.co.kr/learn/courses/30/lessons/131704
    public static Stream<Arguments> Q131704() {
        return Stream.of(
            arguments(new int[]{4, 3, 1, 2, 5}, 2),
            arguments(new int[]{5, 4, 3, 2, 1}, 5)
        );
    }

    //https://school.programmers.co.kr/learn/courses/30/lessons/60058
    public static Stream<Arguments> Q60058() {
        return Stream.of(
            arguments("(()())()", "(()())()"),
            arguments(")(", "()"),
            arguments("()))((()", "()(())()")
        );
    }

    //https://school.programmers.co.kr/learn/courses/30/lessons/17683
    public static Stream<Arguments> Q17683() {
        return Stream.of(
            arguments("ABCDEFG", new String[]{"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"}, "HELLO"),
            arguments("CC#BCC#BCC#BCC#B", new String[]{"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"}, "FOO"),
            arguments("ABC", new String[]{"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"}, "WORLD")
        );
    }

    //https://school.programmers.co.kr/learn/courses/30/lessons/67257
    public static Stream<Arguments> Q67257() {
        return Stream.of(
            arguments("100-200*300-500+20", 60420L),
            arguments("50*6-3*2", 300L)
        );
    }
}
