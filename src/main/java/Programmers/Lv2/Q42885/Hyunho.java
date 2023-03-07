package Programmers.Lv2.Q42885;

import java.util.Arrays;

public class Hyunho {
    //14.03ms, 56.4MB
    public int solution(int[] people, int limit) {
        int answer = 0;
        int nearIndex = 0;
        int farIndex = people.length - 1;

        Arrays.sort(people);

        while (nearIndex <= farIndex) {
            if (people[nearIndex] > limit) {
                break;
            }

            if (people[nearIndex] + people[farIndex] <= limit) {
                nearIndex++;
            }

            farIndex--;
            answer++;
        }

        return answer;
    }
}
