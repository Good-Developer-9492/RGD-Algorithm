package Programmers.Lv2;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FirstWeekOfMay {
    //https://school.programmers.co.kr/learn/courses/30/lessons/68936
    public static Stream<Arguments> Q68936() {
        return Stream.of(
            arguments(new int[][]{{1, 1, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 1}, {1, 1, 1, 1}}, new int[]{4, 9}),
            arguments(
                new int[][]{
                    {1, 1, 1, 1, 1, 1, 1, 1},
                    {0, 1, 1, 1, 1, 1, 1, 1},
                    {0, 0, 0, 0, 1, 1, 1, 1},
                    {0, 1, 0, 0, 1, 1, 1, 1},
                    {0, 0, 0, 0, 0, 0, 1, 1},
                    {0, 0, 0, 0, 0, 0, 0, 1},
                    {0, 0, 0, 0, 1, 0, 0, 1},
                    {0, 0, 0, 0, 1, 1, 1, 1}
                },
                new int[]{10, 15})
        );
    }

    //https://school.programmers.co.kr/learn/courses/30/lessons/132265
    public static Stream<Arguments> Q132265() {
        return Stream.of(
            arguments(new int[]{1, 2, 1, 3, 1, 4, 1, 2}, 2),
            arguments(new int[]{1, 2, 3, 1, 4}, 0)
        );
    }

    //https://school.programmers.co.kr/learn/courses/30/lessons/42883
    public static Stream<Arguments> Q42883() {
        return Stream.of(
            arguments("1924", 2, "94"),
            arguments("1231234", 3, "3234"),
            arguments("4177252841", 4, "775841")
        );
    }

    //https://school.programmers.co.kr/learn/courses/30/lessons/68645
    public static Stream<Arguments> Q68645() {
        return Stream.of(
            arguments(4, new int[]{1, 2, 9, 3, 10, 8, 4, 5, 6, 7}),
            arguments(5, new int[]{1, 2, 12, 3, 13, 11, 4, 14, 15, 10, 5, 6, 7, 8, 9}),
            arguments(6, new int[]{1, 2, 15, 3, 16, 14, 4, 17, 21, 13, 5, 18, 19, 20, 12, 6, 7, 8, 9, 10, 11})
        );
    }

    //https://school.programmers.co.kr/learn/courses/30/lessons/12899
    public static Stream<Arguments> Q12899() {
        return Stream.of(
            arguments(1, "1"),
            arguments(2, "2"),
            arguments(3, "4"),
            arguments(4, "11")
        );
    }

    //https://school.programmers.co.kr/learn/courses/30/lessons/72411
    public static Stream<Arguments> Q72411() {
        return Stream.of(
            arguments(
                new String[] {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"},
                new int[] {2,3,4},
                new String[] {"AC", "ACDE", "BCFG", "CDE"}),
            arguments(
                new String[] {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"},
                new int[] {2,3,5},
                new String[] {"ACD", "AD", "ADE", "CD", "XYZ"}
            ),
            arguments(
                new String[] {"XYZ", "XWY", "WXA"},
                new int[] {2,3,4},
                new String[] {"WX", "XY"}
            )
        );
    }
}
