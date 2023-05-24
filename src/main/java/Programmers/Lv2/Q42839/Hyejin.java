package Programmers.Lv2.Q42839;

import java.util.HashSet;
import java.util.Set;

public class Hyejin {
    Set<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        int answer = 0;
        String[] split = numbers.split("");
        boolean[] visit = new boolean[split.length];

        dfs("", 0, split, visit);

        return set.size();
    }

    private void dfs(String s, int count, String[] split, boolean[] visit) {

        if (!s.equals("")) {
            int n = Integer.parseInt(s);
            if (isPrime(n)) {
                set.add(n);
            }
        }

        if (count == split.length) {
            return;
        }

        for (int i = 0; i < split.length; i++) {
            //이미 꺼낸 숫자는 넘기기
            if (visit[i]) continue;

            visit[i] = true;
            dfs(s + split[i], count + 1, split, visit);
            visit[i] = false;
        }
    }

    private boolean isPrime(int num) {
        if (num == 0 || num == 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;

    }
}
