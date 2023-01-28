package Lv1.programmers.Q134240;

public class Hyunho {
    //11.48ms, 88.2MB
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            sb.append(String.valueOf(i).repeat(count));
        }
        String foodStr = sb.toString();

        return foodStr + "0" + sb.reverse();
    }
}
