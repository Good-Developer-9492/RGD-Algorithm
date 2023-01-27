package Lv1.programmers.Q42889;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Hyunho {
    /**
     * 테스트 1 〉	통과 (6.25ms, 73.6MB)
     * 테스트 2 〉	통과 (8.61ms, 87MB)
     * 테스트 3 〉	통과 (39.38ms, 83.3MB)
     * 테스트 4 〉	통과 (154.05ms, 97.8MB)
     * 테스트 5 〉	통과 (436.39ms, 84MB)
     * 테스트 6 〉	통과 (8.80ms, 71.9MB)
     * 테스트 7 〉	통과 (17.15ms, 79.1MB)
     * 테스트 8 〉	통과 (116.50ms, 88.4MB)
     * 테스트 9 〉	통과 (531.75ms, 83.3MB)
     * 테스트 10 〉	통과 (51.98ms, 96.4MB)
     * 테스트 11 〉	통과 (115.74ms, 80.3MB)
     * 테스트 12 〉	통과 (57.44ms, 85MB)
     * 테스트 13 〉	통과 (110.82ms, 87.5MB)
     * 테스트 14 〉	통과 (4.88ms, 70.5MB)
     * 테스트 15 〉	통과 (12.89ms, 76.2MB)
     * 테스트 16 〉	통과 (14.12ms, 73.1MB)
     * 테스트 17 〉	통과 (14.57ms, 74.8MB)
     * 테스트 18 〉	통과 (13.00ms, 93.3MB)
     * 테스트 19 〉	통과 (9.65ms, 79.7MB)
     * 테스트 20 〉	통과 (12.33ms, 84.9MB)
     * 테스트 21 〉	통과 (16.78ms, 88.3MB)
     * 테스트 22 〉	통과 (243.78ms, 90.2MB)
     * 테스트 23 〉	통과 (22.58ms, 94.9MB)
     * 테스트 24 〉	통과 (26.81ms, 98.2MB)
     * 테스트 25 〉	통과 (4.51ms, 76.5MB)
     * 테스트 26 〉	통과 (4.25ms, 78.4MB)
     * 테스트 27 〉	통과 (4.64ms, 80MB)
     */
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        List<Stage> stageList = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            Stage stage = new Stage(i);
            int arrival = 0;
            int clear = 0;

            for (int k : stages) {
                if (i == k) arrival++;
                if (i <= k) clear++;
            }

            stage.initData(arrival, clear);
            stageList.add(stage);
        }

        stageList = stageList.stream()
            .sorted(Comparator.comparing(Stage::getFailureRate).reversed().thenComparing(Stage::getStageNumber))
            .collect(Collectors.toList());

        System.out.println(stageList.size());

        for (int i = 0; i < N; i++) {
            answer[i] = stageList.get(i).stageNumber;
            System.out.println("answer = " + answer[i]);
        }

        return answer;
    }


    static class Stage {
        int stageNumber;
        int arrivalCount;
        int clearCount;
        double failureRate;

        public Stage(int stageNumber) {
            this.stageNumber = stageNumber;
        }

        public void initData(int arrivalCount, int clearCount) {
            this.arrivalCount = arrivalCount;
            this.clearCount = clearCount;
            this.failureRate = calcFailureRate();
        }

        private double calcFailureRate() {
            if (arrivalCount == 0 && clearCount == 0) {
                return 0;
            }
            return (double) arrivalCount / clearCount;
        }

        public int getStageNumber() {
            return stageNumber;
        }

        public int getArrivalCount() {
            return arrivalCount;
        }

        public int getClearCount() {
            return clearCount;
        }

        public double getFailureRate() {
            return failureRate;
        }
    }
}
