package Programmers.Lv1.Q81301;

public class Hyunho {
    public int solution(String s) {
        int answer = 0;
        return Integer.parseInt(changeWordToNumber(s));
    }

    public String changeWordToNumber(String str) {
        if (str.contains("zero")) {
            str = str.replaceAll("zero", "0");
        }
        if (str.contains("one")) {
            str = str.replaceAll("one", "1");
        }
        if (str.contains("two")) {
            str = str.replaceAll("two", "2");
        }
        if (str.contains("three")) {
            str = str.replaceAll("three", "3");
        }
        if (str.contains("four")) {
            str = str.replaceAll("four", "4");
        }
        if (str.contains("five")) {
            str = str.replaceAll("five", "5");
        }
        if (str.contains("six")) {
            str = str.replaceAll("six", "6");
        }
        if (str.contains("seven")) {
            str = str.replaceAll("seven", "7");
        }
        if (str.contains("eight")) {
            str = str.replaceAll("eight", "8");
        }
        if (str.contains("nine")) {
            str = str.replaceAll("nine", "9");
        }

        return str;
    }
}
