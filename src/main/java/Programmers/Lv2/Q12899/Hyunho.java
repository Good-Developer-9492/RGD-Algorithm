package Programmers.Lv2.Q12899;

public class Hyunho {
    public String solution(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        //오른쪽에서 두 번째 자릿수는 3개씩 반복.
        while (n > 0) {
            int number = (n - 1) % 3;

            if (number == 0) {
                stringBuilder.insert(0, "1");
            }
            if (number == 1) {
                stringBuilder.insert(0, "2");
            }
            if (number == 2) {
                stringBuilder.insert(0, "4");
            }

            n = (n - 1) / 3;
        }

        return stringBuilder.toString();
    }
}

// 1
// 2
// 4
//11
//12
//14
//21
//22
//24
//
// 1
//11
//21
//41
//111
//121
//141
//211
//221
//241
//411
//421
//441
