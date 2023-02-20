package Programmers.Lv1.Q17682;

public class Tuna {
    // (0.25ms, 75MB)
    public int solution(String dartResult) {
        String[] arr = dartResult.split("");

        int answer = 0;
        int[] score = new int[3];
        int scoreIndex = 0;
        int beforeArr = Integer.parseInt(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (isNumber(arr[i])) {
                if (beforeArr == 0) {
                    beforeArr = Integer.parseInt(arr[i]);
                } else {
                    beforeArr = beforeArr * 10 + Integer.parseInt(arr[i]);
                }
            } else if (isBonus(arr[i])) {
                if (arr[i].equals("D")) {
                    beforeArr = (int) Math.pow(beforeArr, 2);
                } else if (arr[i].equals("T")) {
                    beforeArr = (int) Math.pow(beforeArr, 3);
                }
                score[scoreIndex++] = beforeArr;
                answer += beforeArr;
                beforeArr = 0;
            } else if (isOption(arr[i])) {
                if (arr[i].equals("*")) {
                    if (scoreIndex == 1) {
                        answer += score[scoreIndex - 1];
                        score[scoreIndex - 1] *= 2;
                    } else {
                        answer += score[scoreIndex - 2] + score[scoreIndex - 1];
                        score[scoreIndex - 2] *= 2;
                        score[scoreIndex - 1] *= 2;
                    }
                } else if (arr[i].equals("#")) {
                    score[scoreIndex - 1] = -score[scoreIndex - 1];
                    answer += score[scoreIndex - 1] * 2;
                }
            }
        }

        return answer;
    }

    private boolean isNumber(String s) {
        return s.matches("\\d");
    }

    private boolean isBonus(String s) {
        return s.equals("S") || s.equals("D") || s.equals("T");
    }

    private boolean isOption(String s) {
        return s.equals("*") || s.equals("#");
    }
}
