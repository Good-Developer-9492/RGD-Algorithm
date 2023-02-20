package Programmers.Lv1.Q17682;

public class Hyunho {
    //0.42ms, 75.7MB ~ 0.81ms, 77.6MB
    public int solution(String dartResult) {
        int answer = 0;
        String[] dartResults = dartResult.split("");
        int[] score = new int[3];
        int scoreIdx = 0;
        StringBuilder tempScore = new StringBuilder();


        for (String result : dartResults) {
            if (isNumber(result)) {
                tempScore.append(result);
            } else if (isBonus(result)) {
                score[scoreIdx++] = bonus(result, tempScore.toString());
                tempScore = new StringBuilder();
            } else if (isOption(result)) {
                if (result.equals("*")) {
                    if (scoreIdx != 1) {
                        score[scoreIdx - 2] = score[scoreIdx - 2] * 2;
                    }
                    score[scoreIdx - 1] = score[scoreIdx - 1] * 2;
                } else {
                    score[scoreIdx - 1] = score[scoreIdx - 1] * -1;
                }
            }
        }
        for (int s : score) {
            answer += s;
        }

        return answer;
    }

    private boolean isNumber(String s) {
        return s.matches("-?\\d+(\\.\\d+)?");
    }

    private boolean isBonus(String s) {
        return s.equals("S") || s.equals("D") || s.equals("T");
    }

    private int bonus(String bonus, String s) {
        int number = Integer.parseInt(s);
        if (bonus.equals("S")) {
            return number;
        } else if (bonus.equals("D")) {
            return number * number;
        } else {
            return number * number * number;
        }
    }

    private boolean isOption(String s) {
        return s.equals("*") || s.equals("#");
    }
}
