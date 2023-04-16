package Programmers.Lv2.Q92341;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Tuna {
    // (5.86ms ~ 101.81ms / 71.2MB ~ 91.6MB)
    public int[] solution(int[] fees, String[] records) {
        // 현재 주차되어 있는 차량 정보 모을 Map (차량번호, 입차시간)
        Map<String, LocalTime> inMap = new HashMap<>();
        // 주차되었던 차량들의 시간을 모아둘 Map (차량번호, 주차시간(분))
        Map<String, Long> timeMap = new HashMap<>();

        // record 나누기
        for (String record : records) {
            String[] inform = record.split(" ");
            LocalTime time = LocalTime.parse(inform[0]);
            String car = inform[1];
            String inOut = inform[2];

            // IN 일 경우, 주차 Map에 저장
            if (inOut.equals("IN")) {
                inMap.put(car, time);
            } else { // OUT 일 경우, 주차 Map에서 제거 및 시간 Map에 추가
                long plusTime = Math.abs(ChronoUnit.MINUTES.between(time, inMap.get(car)));
                timeMap.put(car, timeMap.getOrDefault(car, 0L) + plusTime);
                inMap.remove(car);
            }
        }

        // 끝까지 출차되지 않은 차량 23:59으로 정산
        for (String car : inMap.keySet()) {
            long plusTime = Math.abs(ChronoUnit.MINUTES.between(LocalTime.of(23, 59), inMap.get(car)));
            timeMap.put(car, timeMap.getOrDefault(car, 0L) + plusTime);
        }

        // 시간 Map을 활용해서 결과값 int[] 생성
        // 차량 번호가 작은 자동차부터 (sort)
        String[] carArr = timeMap.keySet().toArray(String[]::new);
        Arrays.sort(carArr);

        // 결과값 int[]
        int[] answer = new int[carArr.length];
        for (int i = 0; i < carArr.length; i++) {
            // 금액 산정할 시간 가져오기
            Long priceTime = timeMap.get(carArr[i]);
            // 기본 시간 이하면 기본요금만 정산
            if (priceTime <= fees[0]) {
                answer[i] = fees[1];
            } else {
                // 기본 시간에 대한 기본요금 먼저 정산
                priceTime -= fees[0];
                answer[i] = fees[1];
                // 기본 시간을 넘는 추가요금을 정산
                // 단위시간을 초과한 시간 올림처리
                priceTime = priceTime % fees[2] == 0 ? priceTime / fees[2] : priceTime / fees[2] + 1;
                answer[i] += priceTime * fees[3];
            }
        }
        return answer;
    }
}
