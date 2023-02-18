package Lv1.programmers.Q150370;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hyejin {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        //2022.05.19
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate date = LocalDate.parse(today, formatter);

        //약관 종류별 유효기간 저장
        Map<String, Integer> termsMap = new HashMap<>();
        for (String t : terms) {
            String[] split = t.split(" ");
            termsMap.put(split[0], Integer.parseInt(split[1]));
        }

        //오늘날짜가 약관일자가 지났는지 확인한다
        for (int i = 0; i < privacies.length; i++) {
            String p = privacies[i];
            String[] split = p.split(" ");
            LocalDate pd = LocalDate.parse(split[0], formatter);

            LocalDate afterDay = pd.plusMonths(termsMap.get(split[1])).minusDays(1);

            if (date.isAfter(afterDay)) {
                list.add(i + 1);
            }
        }

        return list.stream().mapToInt(v -> v).toArray();
    }
}
