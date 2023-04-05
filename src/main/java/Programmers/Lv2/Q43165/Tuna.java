package Programmers.Lv2.Q43165;

public class Tuna {
    // (0.5ms / 77MB)
    public int solution(int[] numbers, int target) {
        return recursive(numbers, target, 0, 0);
    }

    private int recursive(int[] numbers, int target, int length, int sum) {
        if (length == numbers.length && sum == target) {
            return 1;
        }

        if (length == numbers.length)
            return 0;

        int count = 0;

        count += recursive(numbers, target, length + 1, sum + numbers[length]);
        count += recursive(numbers, target, length + 1, sum - numbers[length]);

        return count;
    }
}
