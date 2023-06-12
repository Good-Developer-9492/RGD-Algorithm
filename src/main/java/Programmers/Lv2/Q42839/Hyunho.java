package Programmers.Lv2.Q42839;

import java.util.Objects;

public class Hyunho {
    private final boolean[] comb = new boolean[10000000];
    private final boolean[] taken = new boolean[7];

    public int solution(String numbers) {
        int ans = 0;
        numberOfCases("", 0, numbers);

        for (int i = 2; i < 10000000; i++) {
            if (comb[i] && isPrime(i)) {
                ans++;
            }
        }
        return ans;
    }

    public boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void numberOfCases(String str, int idx, String numbers) {
        // 1. 재귀 함수 탈출 조건
        if (idx == numbers.length() + 1) {
            return;
        }
        // 2. 현재까지 조합된 숫자를 comb 배열에 표시
        if (!Objects.equals(str, "")) {
            comb[Integer.parseInt(str)] = true;
        }
        // 3. 0 ~ n-1 까지의 숫자카드 중 아직 사용되지 않은 카드를 하나씩 사용하여 붙여서 다음 재귀로 넘기기
        for (int i = 0; i < numbers.length(); i++) {
            if (!taken[i]) {
                taken[i] = true;
                numberOfCases(str + numbers.charAt(i), idx + 1, numbers);
                taken[i] = false;
            }
        }
    }
}
