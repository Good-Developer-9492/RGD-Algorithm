package Programmers.Lv1.Q159994;

public class Hyejin {
    //0.01ms, 76.2MB
    //0.05ms, 77.7MB
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        int cards1Idx = 0;
        int cards2Idx = 0;
        int goalIdx = 0;

        while (cards1.length > cards1Idx && cards2.length > cards2Idx) {
            if (goalIdx >= goal.length) return "Yes";
            String cards1Word = cards1[cards1Idx];
            String cards2Word = cards2[cards2Idx];
            String goalWord = goal[goalIdx++];

            if (cards1Word.equals(goalWord)) {
                cards1Idx++;
                continue;
            }

            if (cards2Word.equals(goalWord)) {
                cards2Idx++;
                continue;
            }

            return "No";
        }

        //card1, card2 둘중 남은 단어들 확인
        if (!availableMakeWord(cards1, cards1Idx, goal, goalIdx)) return "No";
        if (!availableMakeWord(cards2, cards2Idx, goal, goalIdx)) return "No";


        return "Yes";
    }

    private boolean availableMakeWord(String[] array, int index, String[] goalArray, int goalIndex) {
        for (int i = index; i < array.length; i++) {
            if (goalIndex >= goalArray.length) return true;
            if (array[i].equals(goalArray[goalIndex++])) continue;
            return false;
        }
        return true;
    }
}

