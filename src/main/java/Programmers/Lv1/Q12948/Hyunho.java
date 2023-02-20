package Programmers.Lv1.Q12948;

public class Hyunho {
    //1.71ms, 71.2MB
    public String solution(String phone_number) {
        String exclusionNumber =
            phone_number.substring(phone_number.length() - 4, phone_number.length());

        String numberToChange =
            phone_number.substring(0, phone_number.length() - 4).replaceAll("[0-9]", "*");

        return numberToChange + exclusionNumber;
    }
}
