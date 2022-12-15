package Lv1.programmers.Q12919;

public class Hyunho {
    //0.13ms, 72.2MB
    public String solution(String[] seoul) {
        StringBuilder sb = new StringBuilder();
        sb.append("김서방은 ");

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")){
                sb.append(i);
                sb.append("에 있다");
                break;
            }
        }

        return sb.toString();
    }
}
