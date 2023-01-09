package Lv1.programmers.Q12926;

public class Hyejin {
    public String solution(String s, int i) {
        //0.03ms, 75.9MB
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(c);
                continue;
            }
            char newWord = (char) (c + i);

            if (isOverSmallLetter(c,newWord) || isOverUpperCase(c,newWord)) {
                newWord = (char) (newWord - 26);
            }
            sb.append(newWord);

        }
        return sb.toString();
    }


    private boolean isOverSmallLetter(char c, char n){
        return c > 96 && n > 122;
    }
    private boolean isOverUpperCase(char c, char n){
        return c < 91 && n > 90;

    }
}
