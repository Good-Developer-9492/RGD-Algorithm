package Programmers.Lv2.Q42839;

import java.util.HashSet;
import java.util.Set;

public class Tuna {
    // (12.82ms ~ 156.12ms / 75.9MB ~ 115MB)
    private static Set<Integer> set;
    public int solution(String numbers) {
        set = new HashSet<>();

        // 재귀를 통해 조합될 수 있는 모든 숫자 조합 set에 저장
        recursive("", numbers);

        // 에라토스테네스의 체
        boolean[] isNotPrime = new boolean[(int) Math.pow(10, numbers.length())];
        isNotPrime[0] = true;
        isNotPrime[1] = true;
        for (int i = 2; i < Math.sqrt(isNotPrime.length); i++) {
            if (isNotPrime[i]) continue;

            for (int j = 2; i * j < isNotPrime.length; j++) {
                isNotPrime[i * j] = true;
            }
        }

        int answer = 0;
        // set에 저장된 숫자들이 소수인지 아닌지 판별
        for (int num : set) {
            System.out.println(num);
            if (!isNotPrime[num]) {
                answer++;
            }
        }

        return answer;
    }

    // 모든 숫자 조합을 만들어줄 재귀 함수
    private void recursive(String str, String rest) {
        if (!str.equals("")) {
            set.add(Integer.parseInt(str));
        }

        for (int i = 0 ; i < rest.length() ; i++) {
            recursive(str + rest.charAt(i), rest.substring(0,i) + rest.substring(i+1));
        }
    }
}
