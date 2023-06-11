package Programmers.Lv2.Q92335;

public class Hyejin {
    public int solution(int n, int k) {
        int answer = 0;
        //n진법으로 바꾼다
        String radix = Integer.toString(n, k);
        //0을 기준으로 짜른다-> 빈칸 넘어가기
        for (String s : radix.split("0")) {
            if ("".equals(s)) continue;
            //변환한 값이 소수면 증가
            long num = Long.parseLong(s);
            if (isPrime(num)) answer++;
        }

        return answer;
    }

    private boolean isPrime(long num) {
        if (num == 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
