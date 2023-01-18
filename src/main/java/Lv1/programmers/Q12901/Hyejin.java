package Lv1.programmers.Q12901;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Hyejin {
    //25.02ms, 85.2MB
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
        return date.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();
    }

    public String solution2(int a, int b) {
        //0.03ms, 72.6MB
        int[] lastDay = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day = b;
        for (int i = 1; i < a; i++) {
            day += lastDay[i];
        }
        switch (day % 7) {
            case 0:
                return "THU";
            case 1:
                return "FRI";
            case 2:
                return "SAT";
            case 3:
                return "SUN";
            case 4:
                return "MON";
            case 5:
                return "TUE";
            case 6:
                return "WED";
        }
        return "";
    }
}
