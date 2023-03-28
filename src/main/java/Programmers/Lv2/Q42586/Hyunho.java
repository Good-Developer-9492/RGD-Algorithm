package Programmers.Lv2.Q42586;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Hyunho {
    //3.10ms, 75.9MB
    private static final int MAX_JOB_PROGRESS = 100;
    public int[] solution(int[] progresses, int[] speeds) {

        List<Integer> resultList = new ArrayList<>();
        Queue<Integer> jobQueue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int result = (MAX_JOB_PROGRESS - progresses[i]) / speeds[i];
            int resultJob = ((MAX_JOB_PROGRESS - progresses[i]) % speeds[i] == 0) ? result : result + 1;

            jobQueue.add(resultJob);
        }

        while (jobQueue.size() > 0) {
            int count = 1;
            int firstValue = jobQueue.poll();

            for (int i = 0; i < jobQueue.size(); i++) {
                if (jobQueue.isEmpty() || jobQueue.peek() > firstValue) {
                    break;
                }

                jobQueue.poll();
                count++;
                --i;
            }
            resultList.add(count);
        }

        return resultList.stream()
            .mapToInt(i -> i)
            .toArray();
    }
}
