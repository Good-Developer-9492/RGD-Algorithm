package Programmers.Lv2.Q42885;

import java.util.Arrays;

public class Hyejin {
    public int solution(int[] people, int limit) {
        int answer = 0;
        //몸무게 가벼운 순으로 정렬
        Arrays.sort(people);

        int lp = 0;
        int rp = people.length - 1;

        while (lp <= rp) {

            if (people[lp] > limit) break;

            //가벼운사람 더 태울 수 있으면 태우기
            if (people[lp] + people[rp] <= limit) lp++;

            //무거운사람 먼저 태우기
            rp--;
            answer++;
        }

        return answer;
    }
}
