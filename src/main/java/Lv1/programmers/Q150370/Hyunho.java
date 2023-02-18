package Lv1.programmers.Q150370;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hyunho {
    //3.05ms, 74.8MB - 8.10ms, 75.5MB
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> termMap = new HashMap<>();

        LocalDate todayLocalDate = convertStringToLocalDate(today);

        for (String term : terms) {
            String[] termInfo = term.split(" ");
            termMap.put(termInfo[0], Integer.parseInt(termInfo[1]));
        }

        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < privacies.length; i++) {
            String[] privacyInfo = privacies[i].split(" ");
            LocalDate localDate = convertStringToLocalDate(privacyInfo[0]);

            Integer term = termMap.get(privacyInfo[1]);

            if (todayLocalDate.isAfter(localDate.plusMonths(term).minusDays(1))){
                answerList.add(i+1);
            }
        }

        return answerList.stream().mapToInt(i -> i).toArray();
    }

    private LocalDate convertStringToLocalDate(String dateStr) {
        String[] dateInfo = dateStr.split("\\.");

        return LocalDate.of(
            Integer.parseInt(dateInfo[0]),
            Integer.parseInt(dateInfo[1]),
            Integer.parseInt(dateInfo[2]));
    }
}
