package Programmers.Lv1.Q150370;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tuna {
    // (5ms, 77MB)
    public int[] solution(String today, String[] terms, String[] privacies) {
        // term별 약관 종류와 유효 기간을 Map으로 저장
        Map<String, Integer> termsMap = new HashMap<>();
        for (String term : terms) {
            String[] temp = term.split(" ");
            termsMap.put(temp[0], Integer.parseInt(temp[1]));
        }

        // 파기해야 할 개인정보의 번호를 저장할 List 초기화
        List<Integer> list = new ArrayList<>();

        // 개인정보의 번호 1부터 시작
        int index = 1;
        // 파기해야할 개인정보 탐색
        for (String privacy : privacies) {
            // 날짜와 약관종류를 구분
            String[] privacyData = privacy.split(" ");
            String privacyDate = privacyData[0];
            int privacyTerm = termsMap.get(privacyData[1]);

            // 약관종류에 따른 유효기간이 추가된 개인정보 유효기간의 날짜가 오늘 날짜보다 이른 날짜인지 판별
            // 오늘 날짜보다 이른 날짜라면 파기해야할 개인정보 이므로 List에 저장
            if (isBeforeThanToday(today, privacyDate, privacyTerm)) {
//                System.out.printf("TODAY: %s, PRIVACY: %s, TERM: %d\n", today, privacyDate, privacyTerm);
                list.add(index);
            }
            // 다음 개인정보 번호
            index++;
        }

        // 정답이 Array이므로 List to Array 변환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    // 약관종류에 따른 유효기간이 추가된 개인정보 유효기간의 날짜가 오늘 날짜보다 이른 날짜인지 판별하는 메소드
    private boolean isBeforeThanToday(String today, String privacy, int term) {
        // 오늘 날짜 구분
        String[] todayDate = today.split("[.]");
        int todayYear = Integer.parseInt(todayDate[0]);
        int todayMonth = Integer.parseInt(todayDate[1]);
        int todayDay = Integer.parseInt(todayDate[2]);

        // 개인정보 유효기간 날짜 구분
        String[] privacyDate = privacy.split("[.]");
        int privacyYear = Integer.parseInt(privacyDate[0]);
        int privacyMonth = Integer.parseInt(privacyDate[1]);
        int privacyDay = Integer.parseInt(privacyDate[2]);

        // 개인정보 유효기간에 약관에 따른 유효기간 추가
        privacyYear += term / 12;
        privacyMonth += term % 12;

        if (privacyMonth > 12) {
            privacyYear += 1;
            privacyMonth -= 12;
        }

//        System.out.printf("TODAY[YEAR: %d, MONTH: %d, DAY: %d]\n", todayYear, todayMonth, todayDay);
//        System.out.printf("PRIVACY[YEAR: %d, MONTH: %d, DAY: %d]\n", privacyYear, privacyMonth, privacyDay);
        // 연도 먼저 비교
        if (todayYear > privacyYear) {
            return true;
        } else if (todayYear < privacyYear) {
            return false;
        } else {
            // 연도가 동일할 경우 월 비교
            if (todayMonth > privacyMonth) {
                return true;
            } else if (todayMonth < privacyMonth) {
                return false;
            } else {
                // 월이 동일할 경우 일 비교
                // 일이 동일할 경우는 유효기간이 지나지 않았다고 판단할 수 있음
                if (todayDay >= privacyDay) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }
}
