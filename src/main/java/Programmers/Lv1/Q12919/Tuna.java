package Programmers.Lv1.Q12919;

public class Tuna {
    // (1ms, 75MB)
    public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = String.format("김서방은 %d에 있다", i);
                break;
            }
        }
        return answer;
    }
}
