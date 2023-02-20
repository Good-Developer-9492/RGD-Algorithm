package Programmers.Lv1.Q12944;

public class Tuna {
    public double solution(int[] arr) {
        // 이 코드의 평균 풀이 시간 0.03ms
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        return (double) sum / arr.length;

        // 이 코드의 평균 풀이 시간 약 2ms
//        return Arrays.stream(arr).average().getAsDouble();
    }
}
