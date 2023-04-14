package Programmers.Lv2.Q49993;

public class Hyunho {

    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        String[] essentialSkill = skill.split("");

        for (String skillTree : skill_trees) {
            String[] skillArray = skillTree.split("");
            int essentialSkillIdx = 0;


            //코드수정 필요............
            for (int j = 0; j < skillArray.length; j++) {
                String s = skillArray[j];
                if (j == skillArray.length - 1) {
                    if (skill.contains(s)) {
                        if (!essentialSkill[essentialSkillIdx].equals(s)) {
                            break;
                        }
                    }
                    answer++;
                    continue;
                }

                if (!skill.contains(s)) {
                    continue;
                }

                if (!essentialSkill[essentialSkillIdx].equals(s)) {
                    break;
                }

                essentialSkillIdx++;
            }
        }

        return answer;
    }
}
