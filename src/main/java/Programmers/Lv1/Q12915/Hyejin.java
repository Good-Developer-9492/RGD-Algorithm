package Programmers.Lv1.Q12915;

import java.util.Arrays;

public class Hyejin {
    //0.51ms, 73.6MB
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        Value[] arr = new Value[strings.length];

        for(int i = 0; i< strings.length; i++){
            arr[i] = new Value(strings[i].charAt(n),strings[i]);
        }

        Arrays.sort(arr);

        for(int i = 0; i< strings.length; i++){
            answer[i] = arr[i].s;
        }

        return answer;
    }

    public static class Value implements Comparable<Value>{
        char index;
        String s;

        public Value(char index, String s) {
            this.index = index;
            this.s = s;
        }

        @Override
        public int compareTo(Value o) {
            if(this.index == o.index) return this.s.compareTo(o.s);
            return this.index - o.index;
        }

    }
}
