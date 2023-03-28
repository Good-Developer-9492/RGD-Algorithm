package Programmers.Lv2.Q17677;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Q17677 {
    public static Stream<Arguments> inputAndResult() {
        return Stream.of(
            arguments("FRANCE", "french", 16384),
            arguments("handshake", "shake hands", 65536),
            arguments("aa1+aa2", "AAAA12", 43690),
            arguments("E=M*C^2", "e=m*c^2", 65536)
        );
    }
}
