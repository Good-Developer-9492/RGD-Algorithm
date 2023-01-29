package Lv1.programmers.Q134240;

public class Tuna {
    // (10ms, 80MB)
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            sb.append(String.valueOf(i).repeat(count));
        }
        String str = sb.toString();

        return str + "0" + sb.reverse();
    }
}
