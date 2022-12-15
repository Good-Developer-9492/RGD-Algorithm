package Lv1.programmers.Q12948;

public class Hyejin {
    public String solution(String phone_number) {
        String lastNum = phone_number.substring(phone_number.length() - 4);
        String replaceNum = phone_number.substring(0,phone_number.length() - 4);
        replaceNum = replaceNum.replaceAll("[0-9]", "*");
        return replaceNum+lastNum;
    }
}
