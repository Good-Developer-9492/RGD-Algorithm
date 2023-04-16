package Programmers.Lv2.Q49994;

import java.util.HashSet;
import java.util.Set;

public class Tuna {
    public int solution(String dirs) {
        // 이미 지나간 길임을 저장할 Set
        Set<String> set = new HashSet<>();

        // 현재 위치 저장
        int[] now = new int[]{0, 0};
        // 지정된 구간 안에서 움직이기
        for (String dir : dirs.split("")) {
            // 각 UDLR 행동으로 이미 간 길임을 기록
            // 다만, 방향이 달라도 같은 길임을 알 수 있도록 Set에 두 방향을 모두 저장
            switch (dir) {
                case "U" -> {
                    if (now[1] == 5) break;
                    set.add(String.format("%d%d%d%d", now[0], now[1], now[0], now[1] + 1));
                    set.add(String.format("%d%d%d%d", now[0], now[1] + 1, now[0], now[1]));
                    now[1]++;
                }
                case "D" -> {
                    if (now[1] == -5) break;
                    set.add(String.format("%d%d%d%d", now[0], now[1], now[0], now[1] - 1));
                    set.add(String.format("%d%d%d%d", now[0], now[1] - 1, now[0], now[1]));
                    now[1]--;
                }
                case "L" -> {
                    if (now[0] == -5) break;
                    set.add(String.format("%d%d%d%d", now[0], now[1], now[0] - 1, now[1]));
                    set.add(String.format("%d%d%d%d", now[0] - 1, now[1], now[0], now[1]));
                    now[0]--;
                }
                case "R" -> {
                    if (now[0] == 5) break;
                    set.add(String.format("%d%d%d%d", now[0], now[1], now[0] + 1, now[1]));
                    set.add(String.format("%d%d%d%d", now[0] + 1, now[1], now[0], now[1]));
                    now[0]++;
                }
                default -> {
                }
            }
        }

        // 해당 길을 이용할 수 있는 두 방향을 모두 저장했으므로 /2로 결과 return
        return set.size() / 2;
    }
}
