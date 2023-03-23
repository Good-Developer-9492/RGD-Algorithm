package Programmers.Lv2.Q64065;

import java.util.*;

public class Hyunho {
    public int[] solution(String s) {
        Tuples tuples = new Tuples(new ArrayList<>());

        String substring = s.substring(2, s.length() - 2);
        String[] arrays = substring.split("},\\{");

        Arrays.sort(arrays, Comparator.comparingInt(String::length));

        Set<String> set = new HashSet<>();

        for (String tuple : arrays) {
            String[] tempArray = tuple.split(",");

            for (String str : tempArray) {
                if (set.contains(str)) {
                    continue;
                }

                tuples.add(str);
                set.add(str);
            }
        }

        return tuples.toArray();
    }

    static class Tuples {
        private final List<String> tupleList;

        public Tuples(List<String> tupleList) {
            this.tupleList = tupleList;
        }

        public void add(String tuple) {
            tupleList.add(tuple);
        }

        public List<String> value() {
            return this.tupleList;
        }

        public int[] toArray() {
            return tupleList.stream()
                .mapToInt(Integer::parseInt)
                .toArray();
        }
    }
}
