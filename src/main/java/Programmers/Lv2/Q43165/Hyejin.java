package Programmers.Lv2.Q43165;

public class Hyejin {
    //0.20ms, 75.9MB
    //6.22ms, 75.9MB
    int count = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, -1, 0, target);
        return count;
    }

    public void dfs(int[] numbers, int depth, int value, int target) {
        if (target == value && depth == numbers.length - 1) {
            count++;
            return;
        }

        if (depth + 1 == numbers.length) return;

        dfs(numbers, depth + 1, value + numbers[depth + 1], target);
        dfs(numbers, depth + 1, value - numbers[depth + 1], target);
    }
}
