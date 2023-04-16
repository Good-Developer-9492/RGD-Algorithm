package Programmers.Lv2.Q92341;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Hyejin {
    //4.96ms, 74.5MB
    //60.00ms, 83.7MB
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> answerMap = new TreeMap<>();
        Map<String, LocalTime> schedule = new HashMap<>();
        for (String record : records) {
            String[] detail = record.split(" ");
            //06:00
            LocalTime time = LocalTime.parse(detail[0], DateTimeFormatter.ofPattern("HH:mm"));
            String carNo = detail[1];

            if (detail[2].equals("IN")) {
                schedule.put(carNo, time);
                continue;
            }

            //out이 나오면 시간 계산하기
            LocalTime in = schedule.get(carNo);

            answerMap.put(carNo, answerMap.getOrDefault(carNo, 0) + calTime(in, time));

            schedule.remove(carNo);
        }

        //records에 없는 시간은 23시 59분 출차다
        for (String carNo : schedule.keySet()) {
            LocalTime out = LocalTime.of(23, 59);
            LocalTime in = schedule.get(carNo);
            answerMap.put(carNo, answerMap.getOrDefault(carNo, 0) + calTime(in, out));
        }

        int[] result = new int[answerMap.size()];
        Set<String> keySet = answerMap.keySet();
        int i = 0;
        for (String k : keySet) {
            result[i++] = calFee(fees, answerMap.get(k));
        }

        return result;
    }

    private int calTime(LocalTime in, LocalTime out) {
        Duration diff = Duration.between(in, out);
        return (int) diff.toMinutes();
    }

    private int calFee(int[] fees, int usedTime) {
        int basicTime = fees[0];
        int basicFee = fees[1];
        int addTime = fees[2];
        int addFee = fees[3];

        if ((usedTime <= basicTime)) return basicFee;

        int additionalTime = usedTime - basicTime;

        if (additionalTime % addTime == 0) return basicFee + (addFee * (additionalTime / addTime));

        return basicFee + (addFee * ((additionalTime / addTime) + 1));

    }
}
