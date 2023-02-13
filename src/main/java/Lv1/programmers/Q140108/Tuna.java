package Lv1.programmers.Q140108;

public class Tuna {
    // (0.4ms / 75MB)
    public int solution(String s) {
        char x = s.charAt(0);
        int answer = 0;
        int xCount = 1;
        int anotherCount = 0;
        for (int i = 1; i < s.length(); i++) {
            if (xCount == 0 && anotherCount == 0) {
                x = s.charAt(i);
                xCount = 1;
                continue;
            }

            if (s.charAt(i) != x) {
                anotherCount++;
            } else {
                xCount++;
            }

            if (xCount == anotherCount) {
                System.out.println(i + " " + xCount + " " + anotherCount);
                answer++;
                xCount = 0;
                anotherCount = 0;
            }
        }

        if (xCount != 0 || anotherCount != 0) answer++;

        return answer;
    }
}
