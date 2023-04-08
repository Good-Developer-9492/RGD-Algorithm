package Programmers.Lv2.Q17687;

import java.util.Arrays;

public class Hyunho {
    public String solution(int n, int t, int m, int p) {
        int numIndex = 0;
        StringBuilder result = new StringBuilder();
        int lastPosition = 1;

        while (t > result.length()) {
            //진수 변환
            String binaryStr = ArithmeticOperator.transformation(n, numIndex++);
            String[] arr = binaryStr.split("");

            for (String s : arr) {
                //몇번째 사람이 숫자를 불러야하는지 계산
                int position = lastPosition;
                if (lastPosition > m) {
                    int calcPosition = lastPosition % m;
                    position = calcPosition == 0 ? m : calcPosition;
                }

                //내가 숫자를 말할 순번인지 확인
                if (position == p) {
                    result.append(s);
                }

                //미리 구해야하는 숫자 수가 일치하면 종료
                if (t == result.length()) {
                    break;
                }

                lastPosition++;
            }
        }

        return result.toString();
    }

    enum ArithmeticOperator {
        BINARY(2) {
            @Override
            protected String arithmeticOperator(int number) {
                return Integer.toBinaryString(number);
            }
        },
        OCTAL(8) {
            @Override
            protected String arithmeticOperator(int number) {
                return Integer.toOctalString(number);
            }
        },
        DECIMAL(10) {
            @Override
            protected String arithmeticOperator(int number) {
                return String.valueOf(number);
            }
        },
        HEX(16) {
            @Override
            protected String arithmeticOperator(int number) {
                return Integer.toHexString(number);
            }
        };

        private final int arithmetic;

        ArithmeticOperator(int arithmetic) {
            this.arithmetic = arithmetic;
        }

        protected abstract String arithmeticOperator(int number);

        public static String transformation(int arithmetic, int number) {
            return Arrays.stream(values())
                .filter(a -> a.arithmetic == arithmetic)
                .findFirst()
                .map(ao -> ao.arithmeticOperator(number).toUpperCase())
                .orElseGet(() -> Integer.toString(number, arithmetic).toUpperCase());
        }
    }
}
