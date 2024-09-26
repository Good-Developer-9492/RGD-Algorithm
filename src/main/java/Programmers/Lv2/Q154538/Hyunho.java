package Programmers.Lv2.Q154538;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Hyunho {
    //400.08ms, 171MB
    public int solution(int x, int y, int n) {
        int count = 0;
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(x);
        visited.add(x);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int currentNumber = queue.poll();

                if (currentNumber == y) {
                    return count;
                }

                if (currentNumber + n <= y && !visited.contains(currentNumber + n)) {
                    queue.add(currentNumber + n);
                    visited.add(currentNumber + n);
                }
                if (currentNumber * 2 <= y && !visited.contains(currentNumber * 2)) {
                    queue.add(currentNumber * 2);
                    visited.add(currentNumber * 2);
                }
                if (currentNumber * 3 <= y && !visited.contains(currentNumber * 3)) {
                    queue.add(currentNumber * 3);
                    visited.add(currentNumber * 3);
                }
            }
            count++;
        }

        return -1;
    }
}
