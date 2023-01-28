package Lv1.programmers.Q17682;

public class Hyejin {
    //8.95ms, 79.2MB
    //16.98ms, 81.1MB
    public int solution(String s) {
        int[] score = new int[3];
        String number = "";
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //숫자면 String에 저장만 한다
            if (Character.isDigit(c)) {
                number += c;
                continue;
            }

            //알파벳이면 숫자-1 인덱스에 스코어를 저장한다
            if (Character.isLetter(c)) score = save(score, c, index++, Integer.parseInt(number));

            if (s.charAt(i) == '#') whoops(score, index);
            if (s.charAt(i) == '*') star(score, index);

            //문자 초기화
            number = "";

        }

        return score[0] + score[1] + score[2];
    }


    private int[] save(int[] score, char c, int index, int number) {
        switch (c) {
            case 'S' -> score[index] = number;
            case 'D' -> score[index] = (int) Math.pow(number, 2);
            case 'T' -> score[index] = (int) Math.pow(number, 3);

        }
        return score;
    }

    private int[] whoops(int[] score, int index) {
        //해당 인덱스만 *-1 한다
        score[index - 1] = score[index - 1] * -1;
        return score;
    }

    private int[] star(int[] score, int index) {
        //해당 인덱스 -1 부터 *2한다
        if (index > 1) {
            score[index - 2] = score[index - 2] * 2;
        }
        score[index - 1] = score[index - 1] * 2;

        return score;
    }

}
