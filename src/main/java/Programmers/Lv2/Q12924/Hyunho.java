package Programmers.Lv2.Q12924;

public class Hyunho {
    //0.21ms, 78.4MB
    //3.58ms, 52.1MB
    public int solution(int n) {
        int answer = 1;
        StandardValue standardValue = StandardValue.of(n);
        for (int i = 1; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += j;
                if (standardValue.isSame(sum)) {
                    answer++;
                    break;
                }
                if (standardValue.isExcess(sum)) {
                    break;
                }
            }
        }
        return answer;
    }

    static class StandardValue {
        private final int value;

        private StandardValue(int value) {
            this.value = value;
        }

        public static StandardValue of(int value) {
            return new StandardValue(value);
        }

        public boolean isExcess(int sum) {
            return this.value < sum;
        }

        public boolean isSame(int sum) {
            return this.value == sum;
        }
    }
}

