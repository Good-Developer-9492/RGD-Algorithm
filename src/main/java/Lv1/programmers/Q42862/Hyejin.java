package Lv1.programmers.Q42862;

import java.util.*;

public class Hyejin {
    public int solution(int n, int[] lost, int[] reserve) {
        int count = 0;
        List<Integer> student = new ArrayList<>();
        for(int i = n; i > 0; i--){
            student.add(i);
        }

        for (int i : reserve) {
            if (contain(lost, i)){
                count++;
                remove(lost,i);
                remove(reserve,i);
                student.remove(student.indexOf(i));
            }
        }

        for (int i : student) {

            if (!contain(lost, i)) {
                count++;
                continue;
            }


            if (i + 1 <= n) {
                if (contain(reserve, i + 1)) {
                    count++;
                    remove(reserve, i + 1);
                    continue;
                }
            }

            if (i - 1 > 0) {
                if (contain(reserve, i - 1)) {
                    count++;
                    remove(reserve, i - 1);
                }
            }
        }

        return count;

    }

    private boolean contain(int[] arr, int v) {
        for (int i : arr) {
            if (i == v) return true;
        }
        return false;
    }

    private void remove(int[] arr, int v) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == v) arr[i] = -1;
        }
    }
}
