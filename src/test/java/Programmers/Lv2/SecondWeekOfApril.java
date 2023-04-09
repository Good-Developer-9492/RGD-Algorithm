package Programmers.Lv2;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class SecondWeekOfApril {

    public static Stream<Arguments> Q42888() {
        return Stream.of(
            Arguments.arguments(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"}, new String[]{"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."})
        );
    }

    public static Stream<Arguments> Q42584() {
        return Stream.of(
            Arguments.arguments(
                new int[]{1, 2, 3, 2, 3},
                new int[]{4, 3, 1, 1, 0}
            )
        );
    }

    public static Stream<Arguments> Q12913() {
        return Stream.of(
            Arguments.arguments(new int[][]{{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}}, 16)
        );
    }

    public static Stream<Arguments> Q49993() {
        return Stream.of(
            Arguments.arguments("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"}, 2)
        );
    }

    public static Stream<Arguments> Q49994() {
        return Stream.of(
            Arguments.arguments("ULURRDLLUU", 7),
            Arguments.arguments("LULLLLLLU", 7)
        );
    }

}
