package Programmers.Lv2.Q49993;

public class Tuna {
    // (0.4ms / 75MB)
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        A: for (String skill_tree : skill_trees) {
            // 스킬을 배웠는지 확인할 boolean 배열
            boolean[] learned = new boolean[skill.length()];

            for (String tree : skill_tree.split("")) {
                // 해당 스킬이 순서가 정해진 스킬이면 이전스킬을 배웠는지 확인
                // 순서가 정해지지 않은 스킬이면 무조건 학습가능하니 별다른 조치 없이 진행
                if (skill.contains(tree)) {
                    // 첫번째 스킬이면 학습하고 넘어가기
                    if (skill.indexOf(tree) == 0) {
                        learned[0] = true;
                        continue;
                    }

                    // 첫번째 스킬이 아니면, 이전 스킬을 배웠는지 확인
                    if (learned[skill.indexOf(tree) - 1]) {
                        learned[skill.indexOf(tree)] = true;
                    } else {
                        // 이전 스킬을 배우지 않았으면 해당 스킬트리는 불가능한 스킬트리이므로, 바로 다음 스킬트리 탐색
                        continue A;
                    }
                }
            }
            // 다음 스킬트리를 탐색하러 가지 않고, for문이 정상적으로 끝났다면 스킬트리 학습 완료
            answer++;
        }

        return answer;
    }
}
