package Programmers.Lv2.Q49993;

public class Hyejin {
    //7.55ms, 79.8MB
    //17.69ms, 68MB
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String s : skill_trees) {

            //skill 제외한 값 제거
            s = s.replaceAll("[^" + skill + "]", "");

            boolean isRightPattern = true;
            for (int i = 0; i < s.length(); i++) {
                if (skill.charAt(i) != s.charAt(i)) {
                    isRightPattern = false;
                    break;
                }
            }
            if (isRightPattern) answer++;
        }
        return answer;
    }
}
