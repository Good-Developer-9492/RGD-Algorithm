package Programmers.Lv2.Q92335;

public class Tuna {
    // (0.2ms / 75MB)
    public int solution(int n, int k) {
        // k진수로 변환
        String str = Integer.toUnsignedString(n, k);
        String[] splitedStr = str.split("0");

        int answer = 0;
        for (String tmp : splitedStr) {
            if (tmp.isBlank()) continue;
            // 소수일 경우 추가
            if (isPrimeNumber(tmp)) answer++;
        }

        return answer;
    }

    private boolean isPrimeNumber(String str) {
        long num = Long.parseLong(str);
        if (num == 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
