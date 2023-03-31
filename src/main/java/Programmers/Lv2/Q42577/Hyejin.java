package Programmers.Lv2.Q42577;


import java.util.Arrays;

public class Hyejin {
    //0.18ms, 76.1MB
    //352.04ms, 98.7MB
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) return false;
        }
        return true;
    }


}
