package Programmers.Lv1.Q12948;

public class Tuna {
    // (2ms, 75MB)
    public String solution(String phone_number) {
        return phone_number.substring(0, phone_number.length() - 4).replaceAll("\\d", "*")
            + phone_number.substring(phone_number.length() - 4);
    }
}
