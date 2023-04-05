package Programmers.Lv2.Q42577;

import java.util.Arrays;

public class Tuna {
    // (0.3ms ~ 338.89ms / 75MB ~ 98.6MB)
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i].startsWith(phone_book[i + 1]))
                return false;
            if (phone_book[i + 1].startsWith(phone_book[i]))
                return false;
        }

        return true;
    }
}
