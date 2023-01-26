package Lv1.programmers.Q134240;

public class Hyejin {

    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        int index = 0;

        for (int i = 1; i < food.length; i++) {
            if (food[i] == 1) continue;
            int repeat = food[i] / 2;

            for (int j = 0; j < repeat; j++) {
                sb.insert(index, i);
                sb.insert(sb.length() - index, i);
                index++;
            }
        }
        sb.insert(index, 0);
        return sb.toString();
    }
}
