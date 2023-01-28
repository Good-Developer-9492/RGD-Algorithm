package Lv1.programmers.Q42889;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hyejin {
    //4.16ms, 76MB
    //653.33ms, 88.2MB
    public int[] solution(int N, int[] stages) {

        List<Level> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            int level = i;
            double users = Arrays.stream(stages).filter(u -> u >= level).count();
            double count = Arrays.stream(stages).filter(u -> u == level).count();

            double fail = users == 0 ? 0 : count / users;
            list.add(new Level(level, fail));
        }

        list.sort((Level o1, Level o2) -> {
            if (o1.failureRate == o2.failureRate) return o1.level.compareTo(o2.level);
            return o2.failureRate.compareTo(o1.failureRate);

        });
        return list.stream().map(l -> l.level).mapToInt(v -> v).toArray();

    }

    class Level {
        Integer level;
        Double failureRate;

        public Level(int level, double failureRate) {
            this.level = level;
            this.failureRate = failureRate;
        }
    }

}
